// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class q5a implements Runnable {
    public final /* synthetic */ b77 E;
    public final /* synthetic */ ki8 F;
    public final /* synthetic */ ArrayList G;
    public final /* synthetic */ ArrayList H;
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ k5 c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ long e;
    public final /* synthetic */ r47 f;
    public final /* synthetic */ r47 h;
    public final /* synthetic */ ou1 n;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ int s;
    public final /* synthetic */ c5a w;
    public final /* synthetic */ long x;
    public final /* synthetic */ long y;

    public /* synthetic */ q5a(ArrayList arrayList, ArrayList arrayList2, k5 k5Var, ArrayList arrayList3, long j, r47 r47Var, r47 r47Var2, ou1 ou1Var, boolean z, int i, c5a c5aVar, long j2, long j3, b77 b77Var, ki8 ki8Var, ArrayList arrayList4, ArrayList arrayList5) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = k5Var;
        this.d = arrayList3;
        this.e = j;
        this.f = r47Var;
        this.h = r47Var2;
        this.n = ou1Var;
        this.r = z;
        this.s = i;
        this.w = c5aVar;
        this.x = j2;
        this.y = j3;
        this.E = b77Var;
        this.F = ki8Var;
        this.G = arrayList4;
        this.H = arrayList5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.a;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.b;
        if (isEmpty && arrayList2.isEmpty()) {
            return;
        }
        r7a.U(this.s, this.e, 0L, this.x, this.y, this.c, this.n, null, this.f, this.h, null, this.E, this.F, this.w, null, null, arrayList, this.d, arrayList2, null, this.G, this.H, null, this.r, false);
    }
}
