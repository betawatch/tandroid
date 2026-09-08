package org.telegram.ui.web;

import android.view.View;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
