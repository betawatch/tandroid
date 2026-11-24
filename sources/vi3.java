// default package

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.beta.R;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class vi3 extends xz1 {
    public final /* synthetic */ byte y0 = 3;
    public final /* synthetic */ Object z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi3(hh9 hh9Var, Context context, ylb ylbVar) {
        super(R.drawable.send_plane_24, ylbVar, context, true);
        this.z0 = hh9Var;
    }

    @Override // xz1
    public final boolean b() {
        switch (this.y0) {
            case 0:
            case 1:
                return false;
            case 2:
                return ((jf9) this.z0).i0();
            default:
                return super.b();
        }
    }

    @Override // xz1
    public final boolean d() {
        byte b = this.y0;
        Object obj = this.z0;
        switch (b) {
            case 2:
                if (((jf9) obj).M0 || this.w > 0) {
                    break;
                }
                break;
            case 3:
                if (((hh9) obj).a0 || this.w > 0) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // xz1
    public final int getFillColor() {
        byte b = this.y0;
        Object obj = this.z0;
        switch (b) {
            case 1:
                int i = cmb.pg;
                Drawable[] drawableArr = PhotoViewer.d9;
                return ((PhotoViewer) obj).y0(i);
            case 4:
                return cmb.v0(cmb.R5, ((tca) obj).J0);
            default:
                return super.getFillColor();
        }
    }

    @Override // xz1
    public final boolean j() {
        switch (this.y0) {
            case 0:
            case 1:
            case 4:
                return true;
            case 2:
            case 3:
            default:
                return super.j();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.y0) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(jb6.G(((nk3) this.z0).K2.size(), "AccDescrShareInChats", new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi3(jf9 jf9Var, Context context, int i, ylb ylbVar) {
        super(i, ylbVar, context, true);
        this.z0 = jf9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi3(tca tcaVar, Context context, ylb ylbVar) {
        super(R.drawable.send_plane_24, ylbVar, context, false);
        this.z0 = tcaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi3(nk3 nk3Var, Context context, ylb ylbVar) {
        super(R.drawable.send_plane_24, ylbVar, context, false);
        this.z0 = nk3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi3(PhotoViewer photoViewer, Context context, ylb ylbVar) {
        super(R.drawable.send_plane_24, ylbVar, context, false);
        this.z0 = photoViewer;
    }
}
