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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class sf implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ sf(ArrayList arrayList, byte b) {
        this.a = b;
        this.b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d Q;
        np3 np3Var;
        byte b = this.a;
        byte b2 = 11;
        byte b3 = 1;
        int i = 0;
        ArrayList arrayList = this.b;
        switch (b) {
            case 0:
                if (arrayList == null || (Q = LaunchActivity.Q()) == null) {
                    return;
                }
                bh0 bh0Var = new bh0();
                bh0Var.a = true;
                Q.showAsSheet(new PrivacyControlActivity(11, false), bh0Var);
                return;
            case 1:
                break;
            case 2:
                Utilities.e.c(new sf(arrayList, b3));
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
                op3 op3Var = op3.k;
                op3Var.getClass();
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    Runnable runnable = (Runnable) arrayList.get(i2);
                    if (runnable != null) {
                        if (!op3Var.c.isEmpty() && (op3Var.g / 2 <= op3Var.c.size() || (op3Var.a.isEmpty() && op3Var.e >= op3Var.d))) {
                            np3Var = (np3) op3Var.c.remove(0);
                        } else if (op3Var.a.isEmpty()) {
                            np3Var = new np3("DispatchQueuePoolThreadSafety_" + op3Var.f + "_" + Utilities.b.nextInt(), true);
                            np3Var.setPriority(10);
                            op3Var.e = op3Var.e + 1;
                        } else {
                            np3Var = (np3) op3Var.a.remove(0);
                        }
                        if (!op3Var.h) {
                            Utilities.e.d(op3Var.i, 30000L);
                            op3Var.h = true;
                        }
                        op3Var.g++;
                        op3Var.c.add(np3Var);
                        op3Var.b.put(np3Var.index, op3Var.b.get(np3Var.index, 0) + 1);
                        if (oi5.b) {
                            np3Var.setPriority(1);
                        } else if (np3Var.getPriority() != 10) {
                            np3Var.setPriority(10);
                        }
                        np3Var.postRunnable(new pz2(op3Var, runnable, np3Var, b2));
                    }
                }
                arrayList.clear();
                gm.c3(new sf(arrayList, (byte) 5));
                return;
            case 5:
                op3.l.add(arrayList);
                return;
            case 6:
                AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(a.b);
                while (i < arrayList.size()) {
                    appWidgetManager.notifyAppWidgetViewDataChanged(((Integer) arrayList.get(i)).intValue(), R.id.list_view);
                    i++;
                }
                return;
            case 7:
                nm7.e().k(nm7.i4, arrayList);
                return;
            case 8:
                ru7.h = arrayList;
                ru7.i = false;
                nm7.e().k(nm7.G5, new Object[0]);
                return;
            default:
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    ((View) arrayList.get(i3)).setVisibility(8);
                    if (arrayList.get(i3) instanceof rc2) {
                        ((rc2) arrayList.get(i3)).m3(false, false);
                        ((rc2) arrayList.get(i3)).o3(false, false, false);
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
                    fc4.g(e, true);
                }
            }
            i++;
        }
    }
}
