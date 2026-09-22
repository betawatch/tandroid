package org.telegram.ui.web;

import android.view.View;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
