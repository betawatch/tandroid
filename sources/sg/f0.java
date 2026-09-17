package sg;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public class f0 {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final int e;
    public boolean f;

    public f0(int i10, int i11, int i12, String str, String str2) {
        this.a = i10;
        this.b = i11;
        this.c = str;
        this.d = str2;
        this.e = i12;
    }

    public static f0 a(int i10, int i11) {
        return new f0(i10, i11, -1, null, null);
    }

    public static f0 b(int i10, int i11, String str) {
        return new f0(i10, -1, i11, null, str);
    }
}
