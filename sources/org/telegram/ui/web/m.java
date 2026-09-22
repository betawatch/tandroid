package org.telegram.ui.web;

import android.view.View;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
                ((u2.z0) obj).b.release();
                break;
            default:
                ((ExecutorService) obj).shutdown();
                break;
        }
    }
}
