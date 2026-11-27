// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class xpc extends jl7 {
    public final /* synthetic */ ViewGroup W1;
    public final /* synthetic */ View[] X1;
    public final /* synthetic */ Context Y1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xpc(Context context, ViewGroup viewGroup, vnb vnbVar, ViewGroup viewGroup2, View[] viewArr, Context context2) {
        super(context, viewGroup, vnbVar);
        this.W1 = viewGroup2;
        this.X1 = viewArr;
        this.Y1 = context2;
    }

    @Override // jl7, ny0
    public final void P0(float f) {
        super.P0(f);
        if (this.W1 instanceof vic) {
            this.s0.setBounds(0, (int) f, this.b.getWidth(), this.b.getHeight());
        }
    }

    @Override // ny0
    public final boolean V0() {
        return !(this.W1 instanceof vic);
    }

    @Override // jl7
    public final int Z0() {
        return aob.v0(aob.d6, this.J0);
    }

    @Override // jl7, nx0, android.app.Dialog
    public final void show() {
        super.show();
        if (this.W1 instanceof vic) {
            View[] viewArr = this.X1;
            if (viewArr[0] == null) {
                n4a n4aVar = new n4a(this, this.Y1);
                viewArr[0] = n4aVar;
                this.b.addView(n4aVar, 0, tre.e(-1, 50, 80));
            }
            this.b.setBackground(null);
            this.b.setPadding(0, 0, 0, 0);
            this.n1.setPadding(0, 0, 0, 0);
        }
    }
}
