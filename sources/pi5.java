// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public abstract class pi5 extends FrameLayout {
    public static final HashSet b = new HashSet();
    public static boolean c = false;
    public final boolean a;

    public pi5(Context context) {
        super(context);
        this.a = gda.o() == 2;
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
