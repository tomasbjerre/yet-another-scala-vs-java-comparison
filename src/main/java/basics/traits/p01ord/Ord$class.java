package basics.traits.p01ord;

import basics.traits.p01ord.Ord;

public abstract class Ord$class {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean $less$eq(Ord $this, Object that) {
        if ($this.$less(that)) return true;
        Ord ord = $this;
        Object object = that;
        if (ord != null) {
            if (!ord.equals(object)) return false;
            return true;
        }
        if (object == null) return true;
        return false;
    }

    public static boolean $greater(Ord $this, Object that) {
        return !$this.$less$eq(that);
    }

    public static boolean $greater$eq(Ord $this, Object that) {
        return !$this.$less(that);
    }

    public static void $init$(Ord $this) {
    }
}
