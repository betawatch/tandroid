// default package

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class pu5 implements Iterator {
    public static final pu5 a;
    public static final /* synthetic */ pu5[] b;

    static {
        pu5 pu5Var = new pu5("INSTANCE", 0);
        a = pu5Var;
        b = new pu5[]{pu5Var};
    }

    public static pu5 valueOf(String str) {
        return (pu5) Enum.valueOf(pu5.class, str);
    }

    public static pu5[] values() {
        return (pu5[]) b.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        yve.o("no calls to next() since the last call to remove()", false);
    }
}
