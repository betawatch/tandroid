package org.telegram.ui.web;

import android.view.View;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m implements e2.h {
    public final /* synthetic */ int a;

    @Override // e2.h
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                View view = (View) obj;
                if (view instanceof h) {
                    ((h) view).setChecked(false);
                    break;
                }
                break;
            case 1:
                View view2 = (View) obj;
                if (view2 instanceof h) {
                    ((h) view2).setChecked(false);
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
