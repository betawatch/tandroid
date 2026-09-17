package org.telegram.ui.web;

import android.view.View;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n implements e2.h {
    public final /* synthetic */ int a;

    @Override // e2.h
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                View view = (View) obj;
                if (view instanceof i) {
                    ((i) view).setChecked(false);
                    break;
                }
                break;
            case 1:
                View view2 = (View) obj;
                if (view2 instanceof i) {
                    ((i) view2).setChecked(false);
                    break;
                }
                break;
            case 2:
                ((u2.y0) obj).b.release();
                break;
            default:
                ((ExecutorService) obj).shutdown();
                break;
        }
    }
}
