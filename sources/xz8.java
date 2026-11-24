// default package

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class xz8 extends View {
    public final HashMap a;
    public final ArrayList b;
    public final ArrayList c;
    public final int d;

    public xz8(Activity activity) {
        super(activity);
        this.a = new HashMap();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = z8c.t0;
    }

    public static String b(rc2 rc2Var) {
        k47 messageObject = rc2Var.getMessageObject();
        if (messageObject == null) {
            return null;
        }
        return messageObject.x0() + "_" + messageObject.e1();
    }

    public final boolean a() {
        Iterator it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            if (!((wz8) ((Map.Entry) it.next()).getValue()).P) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
        if (drawable instanceof wz8) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        HashMap hashMap = this.a;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((wz8) ((Map.Entry) it.next()).getValue()).d();
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
            ((wz8) ((Map.Entry) it.next()).getValue()).draw(canvas);
        }
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            wz8 wz8Var = (wz8) hashMap.remove((String) obj);
            if (wz8Var != null) {
                wz8Var.d();
            }
        }
        arrayList.clear();
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Iterator it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            ((wz8) ((Map.Entry) it.next()).getValue()).setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
    }
}
