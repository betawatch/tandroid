// default package

import android.view.View;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class t42 implements pt2 {
    public final /* synthetic */ byte a;

    public /* synthetic */ t42(byte b) {
        this.a = b;
    }

    @Override // pt2
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                View view = (View) obj;
                boolean z = ChatAttachAlertPhotoLayout.r1;
                if (view instanceof d88) {
                    d88 d88Var = (d88) view;
                    d88Var.c(d88Var.getPhotoEntry() != null && d88Var.getPhotoEntry().M, Float.valueOf(250.0f));
                    d88Var.setHighQuality(d88Var.getPhotoEntry() != null && d88Var.getPhotoEntry().c());
                    d88Var.f(d88Var.getPhotoEntry() != null ? d88Var.getPhotoEntry().N : 0L, ChatAttachAlertPhotoLayout.t1.size() > 1);
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                View view2 = (View) obj;
                if (view2 instanceof nw9) {
                    ((nw9) view2).a(false, true);
                    break;
                }
                break;
            default:
                View view3 = (View) obj;
                if (view3 instanceof nw9) {
                    ((nw9) view3).a(false, true);
                    break;
                }
                break;
        }
    }
}
