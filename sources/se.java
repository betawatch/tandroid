// default package

import android.appwidget.AppWidgetManager;
import android.graphics.Bitmap;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class se implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ se(ArrayList arrayList, byte b) {
        this.a = b;
        this.b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d Q;
        do3 do3Var;
        byte b = this.a;
        byte b2 = 1;
        int i = 0;
        ArrayList arrayList = this.b;
        switch (b) {
            case 0:
                if (arrayList == null || (Q = LaunchActivity.Q()) == null) {
                    return;
                }
                ag0 ag0Var = new ag0();
                ag0Var.a = true;
                Q.showAsSheet(new PrivacyControlActivity(11, false), ag0Var);
                return;
            case 1:
                break;
            case 2:
                Utilities.e.c(new se(arrayList, b2));
                return;
            case 3:
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((Bitmap) obj).recycle();
                }
                return;
            case 4:
                eo3 eo3Var = eo3.k;
                eo3Var.getClass();
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    Runnable runnable = (Runnable) arrayList.get(i2);
                    if (runnable != null) {
                        if (!eo3Var.c.isEmpty() && (eo3Var.g / 2 <= eo3Var.c.size() || (eo3Var.a.isEmpty() && eo3Var.e >= eo3Var.d))) {
                            do3Var = (do3) eo3Var.c.remove(0);
                        } else if (eo3Var.a.isEmpty()) {
                            do3Var = new do3("DispatchQueuePoolThreadSafety_" + eo3Var.f + "_" + Utilities.b.nextInt(), true);
                            do3Var.setPriority(10);
                            eo3Var.e = eo3Var.e + 1;
                        } else {
                            do3Var = (do3) eo3Var.a.remove(0);
                        }
                        if (!eo3Var.h) {
                            Utilities.e.d(eo3Var.i, 30000L);
                            eo3Var.h = true;
                        }
                        eo3Var.g++;
                        eo3Var.c.add(do3Var);
                        eo3Var.b.put(do3Var.index, eo3Var.b.get(do3Var.index, 0) + 1);
                        if (pg5.b) {
                            do3Var.setPriority(1);
                        } else if (do3Var.getPriority() != 10) {
                            do3Var.setPriority(10);
                        }
                        do3Var.postRunnable(new mg3(eo3Var, runnable, do3Var, (byte) 9));
                    }
                }
                arrayList.clear();
                gl.d3(new se(arrayList, (byte) 5));
                return;
            case 5:
                eo3.l.add(arrayList);
                return;
            case 6:
                AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(a.b);
                while (i < arrayList.size()) {
                    appWidgetManager.notifyAppWidgetViewDataChanged(((Integer) arrayList.get(i)).intValue(), R.id.list_view);
                    i++;
                }
                return;
            case 7:
                kk7.e().k(kk7.g4, arrayList);
                return;
            case 8:
                qs7.h = arrayList;
                qs7.i = false;
                kk7.e().k(kk7.E5, new Object[0]);
                return;
            default:
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    ((View) arrayList.get(i3)).setVisibility(8);
                    if (arrayList.get(i3) instanceof gb2) {
                        ((gb2) arrayList.get(i3)).m3(false, false);
                        ((gb2) arrayList.get(i3)).o3(false, false, false);
                    }
                }
                return;
        }
        while (i < arrayList.size()) {
            Bitmap bitmap = (Bitmap) ((WeakReference) arrayList.get(i)).get();
            ((WeakReference) arrayList.get(i)).clear();
            if (bitmap != null && !bitmap.isRecycled()) {
                try {
                    bitmap.recycle();
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            }
            i++;
        }
    }
}
