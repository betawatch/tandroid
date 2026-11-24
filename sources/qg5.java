// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public abstract class qg5 extends FrameLayout {
    public static final HashSet b = new HashSet();
    public static boolean c = false;
    public final boolean a;

    public qg5(Context context) {
        super(context);
        this.a = gba.o() == 2;
    }

    public final void a(boolean z) {
        c = false;
        if (z) {
            setLayerType(0, null);
        }
        HashSet hashSet = b;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        hashSet.clear();
    }

    @Override // android.view.View
    public final void invalidate() {
        if (c) {
            b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public final void invalidate(int i, int i2, int i3, int i4) {
        if (c) {
            b.add(this);
        } else {
            super.invalidate(i, i2, i3, i4);
        }
    }
}
