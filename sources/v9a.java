// default package

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class v9a extends o39 {
    public final /* synthetic */ byte f3;
    public final /* synthetic */ taa g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v9a(taa taaVar, Context context, wjb wjbVar, byte b) {
        super(context, wjbVar);
        this.f3 = b;
        this.g3 = taaVar;
    }

    @Override // o39
    public final boolean F0(float f) {
        byte b = this.f3;
        float f2 = 58.0f;
        taa taaVar = this.g3;
        switch (b) {
            case 0:
                if (taaVar.c2 && taaVar.j2[1] != null) {
                    f2 = 111.0f;
                }
                if (f >= gl.L(f2) + taaVar.B2.b) {
                    break;
                }
                break;
            default:
                if (taaVar.c2 && taaVar.j2[1] != null) {
                    f2 = 111.0f;
                }
                if (f >= gl.L(f2) + taaVar.B2.b) {
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
        taa taaVar = this.g3;
        switch (b) {
            case 0:
                o39 o39Var = taaVar.z1;
                if (o39Var.getVisibility() != 8) {
                    canvas.save();
                    int i = taaVar.k2;
                    if (taaVar.c2 && taaVar.j2[1] != null) {
                        f = 111.0f;
                    }
                    canvas.clipRect(0, gl.L(f) + i, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (o39Var.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
            default:
                o39 o39Var2 = taaVar.z1;
                if (o39Var2.getVisibility() != 8) {
                    canvas.save();
                    int i2 = taaVar.k2;
                    if (taaVar.c2 && taaVar.j2[1] != null) {
                        f = 111.0f;
                    }
                    canvas.clipRect(0, gl.L(f) + i2, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (o39Var2.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
        }
    }
}
