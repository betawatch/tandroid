package org.telegram.ui;

import android.view.View;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                boolean z10 = ChatAttachAlertPhotoLayout.m1;
                if (view instanceof org.telegram.ui.Cells.r5) {
                    org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) view;
                    r5Var.c(r5Var.getPhotoEntry() != null && r5Var.getPhotoEntry().hasSpoiler, Float.valueOf(250.0f));
                    r5Var.setHighQuality(r5Var.getPhotoEntry() != null && r5Var.getPhotoEntry().isHighQuality());
                    r5Var.f(r5Var.getPhotoEntry() != null ? r5Var.getPhotoEntry().starsAmount : 0L, ChatAttachAlertPhotoLayout.o1.size() > 1);
                    break;
                }
                break;
            case 2:
                View view2 = (View) obj;
                if (view2 instanceof org.telegram.ui.Components.dn0) {
                    ((org.telegram.ui.Components.dn0) view2).a(false, true);
                    break;
                }
                break;
            default:
                View view3 = (View) obj;
                if (view3 instanceof org.telegram.ui.Components.dn0) {
                    ((org.telegram.ui.Components.dn0) view3).a(false, true);
                    break;
                }
                break;
        }
    }
}
