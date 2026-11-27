// default package

import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class qd2 implements ej8 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ qd2(ViewGroup viewGroup, byte b) {
        this.a = b;
        this.b = viewGroup;
    }

    @Override // ej8
    public final void a(float f, float f2) {
        byte b = this.a;
        ViewGroup viewGroup = this.b;
        switch (b) {
            case 0:
                rd2 rd2Var = (rd2) viewGroup;
                FrameLayout frameLayout = rd2Var.c;
                if (frameLayout != null) {
                    frameLayout.setAlpha(1.0f - f2);
                }
                rd2Var.f = f2;
                rd2Var.b();
                break;
            default:
                ((ula) viewGroup).invalidate();
                break;
        }
    }
}
