package q7;

import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class o0 implements Comparator {
    public static final o0 a;
    public static final /* synthetic */ o0[] b;

    static {
        o0 o0Var = new o0("INSTANCE", 0);
        a = o0Var;
        b = new o0[]{o0Var};
    }

    public static o0[] values() {
        return (o0[]) b.clone();
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        int min = Math.min(bArr.length, bArr2.length);
        for (int i7 = 0; i7 < min; i7++) {
            int i10 = (bArr[i7] & 255) - (bArr2[i7] & 255);
            if (i10 != 0) {
                return i10;
            }
        }
        return bArr.length - bArr2.length;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
    }
}
