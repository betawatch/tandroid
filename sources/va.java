// default package

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class va extends q5c {
    public final /* synthetic */ byte n3 = 3;
    public final /* synthetic */ Object o3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va(Context context, int i, tf8 tf8Var, jq8 jq8Var, jq8 jq8Var2, wjb wjbVar, lca lcaVar) {
        super(context, i, 0, false, tf8Var, jq8Var, jq8Var2, wjbVar, 3, 1);
        this.o3 = lcaVar;
    }

    @Override // o39
    public final boolean F0(float f) {
        switch (this.n3) {
            case 1:
                x02 x02Var = ((h12) this.o3).b;
                return f >= ((float) ((gl.L(30.0f) + x02Var.Y3[0]) + (!x02Var.a2 ? gl.m : 0)));
            default:
                return super.F0(f);
        }
    }

    @Override // q5c
    public final void F1() {
        switch (this.n3) {
            case 1:
                h12 h12Var = (h12) this.o3;
                h12Var.b.H1(h12Var, 0);
                break;
        }
    }

    @Override // q5c
    public final void K1() {
        switch (this.n3) {
            case 2:
                gl.d0(((p6b) this.o3).b, new zf7(this, (byte) 2));
                break;
        }
    }

    @Override // o39
    public final Integer W0(int i) {
        switch (this.n3) {
            case 2:
                return 0;
            default:
                return super.W0(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void m0(int i) {
        cb cbVar;
        switch (this.n3) {
            case 0:
                if (!canScrollVertically(1) && (cbVar = ((eb) this.o3).E) != null && cbVar.h) {
                    cbVar.d();
                    break;
                }
                break;
        }
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        byte b = this.n3;
        Object obj = this.o3;
        switch (b) {
            case 1:
                super.onLayout(z, i, i2, i3, i4);
                h12 h12Var = (h12) obj;
                h12Var.b.H1(h12Var, 0);
                break;
            case 2:
            default:
                super.onLayout(z, i, i2, i3, i4);
                break;
            case 3:
                super.onLayout(z, i, i2, i3, i4);
                ((lca) obj).p();
                break;
            case 4:
                super.onLayout(z, i, i2, i3, i4);
                ((n5c) obj).c = -1;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va(p6b p6bVar, Context context, int i, yg7 yg7Var, im6 im6Var, f53 f53Var) {
        super(context, i, 0, false, yg7Var, im6Var, null, f53Var, -1, 0);
        this.o3 = p6bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va(eb ebVar, Activity activity, int i, f fVar, ta taVar, si5 si5Var) {
        super(activity, i, 0, false, fVar, taVar, null, si5Var);
        this.o3 = ebVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va(h12 h12Var, Context context, int i, f fVar, b12 b12Var, b12 b12Var2, wjb wjbVar) {
        super(context, i, 0, false, fVar, b12Var, b12Var2, wjbVar);
        this.o3 = h12Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va(n5c n5cVar, n5c n5cVar2, n4b n4bVar, m5c m5cVar, m5c m5cVar2) {
        super(n5cVar2, n4bVar, m5cVar, m5cVar2);
        this.o3 = n5cVar;
    }
}
