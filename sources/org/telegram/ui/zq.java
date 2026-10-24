package org.telegram.ui;

import android.view.View;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zq implements q0.a {
    public final /* synthetic */ int a;

    public /* synthetic */ zq(int i10) {
        this.a = i10;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                View view = (View) obj;
                boolean z10 = ChatAttachAlertPhotoLayout.q1;
                if (view instanceof org.telegram.ui.Cells.s5) {
                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
                    s5Var.c(s5Var.getPhotoEntry() != null && s5Var.getPhotoEntry().hasSpoiler, Float.valueOf(250.0f));
                    s5Var.setHighQuality(s5Var.getPhotoEntry() != null && s5Var.getPhotoEntry().isHighQuality());
                    s5Var.f(s5Var.getPhotoEntry() != null ? s5Var.getPhotoEntry().starsAmount : 0L, ChatAttachAlertPhotoLayout.s1.size() > 1);
                    break;
                }
                break;
            case 2:
                View view2 = (View) obj;
                if (view2 instanceof org.telegram.ui.Components.io0) {
                    ((org.telegram.ui.Components.io0) view2).a(false, true);
                    break;
                }
                break;
            default:
                View view3 = (View) obj;
                if (view3 instanceof org.telegram.ui.Components.io0) {
                    ((org.telegram.ui.Components.io0) view3).a(false, true);
                    break;
                }
                break;
        }
    }
}
