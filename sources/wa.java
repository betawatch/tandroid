// default package

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class wa extends q9c {
    public final /* synthetic */ byte n3 = 3;
    public final /* synthetic */ Object o3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa(Context context, int i, hj8 hj8Var, vt8 vt8Var, vt8 vt8Var2, vnb vnbVar, cga cgaVar) {
        super(context, i, 0, false, hj8Var, vt8Var, vt8Var2, vnbVar, 3, 1);
        this.o3 = cgaVar;
    }

    @Override // d79
    public final boolean G0(float f) {
        switch (this.n3) {
            case 1:
                n12 n12Var = ((x12) this.o3).b;
                return f >= ((float) ((hl.L(30.0f) + n12Var.Y3[0]) + (!n12Var.a2 ? hl.m : 0)));
            default:
                return super.G0(f);
        }
    }

    @Override // q9c
    public final void G1() {
        switch (this.n3) {
            case 1:
                x12 x12Var = (x12) this.o3;
                x12Var.b.I1(x12Var, 0);
                break;
        }
    }

    @Override // q9c
    public final void L1() {
        switch (this.n3) {
            case 2:
                hl.d0(((nab) this.o3).b, new ii7(this, (byte) 2));
                break;
        }
    }

    @Override // d79
    public final Integer X0(int i) {
        switch (this.n3) {
            case 2:
                return 0;
            default:
                return super.X0(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void n0(int i) {
        db dbVar;
        switch (this.n3) {
            case 0:
                if (!canScrollVertically(1) && (dbVar = ((fb) this.o3).E) != null && dbVar.h) {
                    dbVar.d();
                    break;
                }
                break;
        }
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        byte b = this.n3;
        Object obj = this.o3;
        switch (b) {
            case 1:
                super.onLayout(z, i, i2, i3, i4);
                x12 x12Var = (x12) obj;
                x12Var.b.I1(x12Var, 0);
                break;
            case 2:
            default:
                super.onLayout(z, i, i2, i3, i4);
                break;
            case 3:
                super.onLayout(z, i, i2, i3, i4);
                ((cga) obj).p();
                break;
            case 4:
                super.onLayout(z, i, i2, i3, i4);
                ((n9c) obj).c = -1;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa(nab nabVar, Activity activity, int i, hj7 hj7Var, bm6 bm6Var, x53 x53Var) {
        super(activity, i, 0, false, hj7Var, bm6Var, null, x53Var, -1, 0);
        this.o3 = nabVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa(fb fbVar, Activity activity, int i, c cVar, ua uaVar, uk5 uk5Var) {
        super(activity, i, 0, false, cVar, uaVar, null, uk5Var);
        this.o3 = fbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa(x12 x12Var, Context context, int i, c cVar, r12 r12Var, r12 r12Var2, vnb vnbVar) {
        super(context, i, 0, false, cVar, r12Var, r12Var2, vnbVar);
        this.o3 = x12Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa(n9c n9cVar, n9c n9cVar2, l8b l8bVar, m9c m9cVar, m9c m9cVar2) {
        super(n9cVar2, l8bVar, m9cVar, m9cVar2);
        this.o3 = n9cVar;
    }
}
