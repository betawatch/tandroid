// default package

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class vba extends r59 {
    public final /* synthetic */ byte f3;
    public final /* synthetic */ tca g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vba(tca tcaVar, Context context, ylb ylbVar, byte b) {
        super(context, ylbVar);
        this.f3 = b;
        this.g3 = tcaVar;
    }

    @Override // r59
    public final boolean F0(float f) {
        byte b = this.f3;
        float f2 = 58.0f;
        tca tcaVar = this.g3;
        switch (b) {
            case 0:
                if (tcaVar.c2 && tcaVar.j2[1] != null) {
                    f2 = 111.0f;
                }
                if (f >= gm.L(f2) + tcaVar.B2.b) {
                    break;
                }
                break;
            default:
                if (tcaVar.c2 && tcaVar.j2[1] != null) {
                    f2 = 111.0f;
                }
                if (f >= gm.L(f2) + tcaVar.B2.b) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        byte b = this.f3;
        float f = 58.0f;
        tca tcaVar = this.g3;
        switch (b) {
            case 0:
                r59 r59Var = tcaVar.z1;
                if (r59Var.getVisibility() != 8) {
                    canvas.save();
                    int i = tcaVar.k2;
                    if (tcaVar.c2 && tcaVar.j2[1] != null) {
                        f = 111.0f;
                    }
                    canvas.clipRect(0, gm.L(f) + i, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (r59Var.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
            default:
                r59 r59Var2 = tcaVar.z1;
                if (r59Var2.getVisibility() != 8) {
                    canvas.save();
                    int i2 = tcaVar.k2;
                    if (tcaVar.c2 && tcaVar.j2[1] != null) {
                        f = 111.0f;
                    }
                    canvas.clipRect(0, gm.L(f) + i2, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (r59Var2.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
        }
    }
}
