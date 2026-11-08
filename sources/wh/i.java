package wh;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.ui.Cells.q1;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class i extends View {
    public final HashMap a;
    public final ArrayList b;
    public final ArrayList c;
    public final int d;

    public i(Activity activity) {
        super(activity);
        this.a = new HashMap();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = p10.s0;
    }

    public static String b(q1 q1Var) {
        ij messageObject = q1Var.getMessageObject();
        if (messageObject == null) {
            return null;
        }
        return messageObject.x0() + "_" + messageObject.f1();
    }

    public final boolean a() {
        Iterator it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            if (!((h) ((Map.Entry) it.next()).getValue()).O) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
        if (drawable instanceof h) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        HashMap hashMap = this.a;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((h) ((Map.Entry) it.next()).getValue()).d();
        }
        hashMap.clear();
        this.b.clear();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        HashMap hashMap = this.a;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((h) ((Map.Entry) it.next()).getValue()).draw(canvas);
        }
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            h hVar = (h) hashMap.remove((String) obj);
            if (hVar != null) {
                hVar.d();
            }
        }
        arrayList.clear();
    }

    @Override // android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        Iterator it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            ((h) ((Map.Entry) it.next()).getValue()).setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
    }
}
