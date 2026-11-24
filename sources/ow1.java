// default package

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ow1 extends ky1 {
    public final /* synthetic */ byte y0 = 0;
    public final /* synthetic */ ChatActivityEnterView z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow1(ChatActivityEnterView chatActivityEnterView, Context context, wjb wjbVar) {
        super(R.drawable.input_done, wjbVar, context, true);
        this.z0 = chatActivityEnterView;
    }

    @Override // ky1
    public final boolean b() {
        switch (this.y0) {
            case 0:
                return this.z0.c();
            default:
                return super.b();
        }
    }

    @Override // ky1
    public final boolean c() {
        byte b = this.y0;
        ChatActivityEnterView chatActivityEnterView = this.z0;
        switch (b) {
            case 0:
                return !chatActivityEnterView.c() && chatActivityEnterView.H0 == Integer.MAX_VALUE;
            default:
                return !chatActivityEnterView.g4;
        }
    }

    @Override // ky1
    public final boolean d() {
        switch (this.y0) {
            case 0:
                j47 j47Var = this.z0.M0;
                if ((j47Var == null || j47Var.u0) && this.w <= 0) {
                }
                break;
        }
        return true;
    }

    @Override // ky1
    public final boolean j() {
        switch (this.y0) {
            case 0:
                return this.z0.X5;
            default:
                return super.j();
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        switch (this.y0) {
            case 0:
                super.setAlpha(f);
                int i = ChatActivityEnterView.r7;
                this.z0.f2();
                break;
            default:
                super.setAlpha(f);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow1(ChatActivityEnterView chatActivityEnterView, Activity activity, int i, wjb wjbVar) {
        super(i, wjbVar, activity, true);
        this.z0 = chatActivityEnterView;
    }
}
