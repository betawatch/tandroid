package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.ToIntFunction;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xe implements ToIntFunction {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xe(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        switch (this.a) {
            case 0:
                return ((Integer) ((HashMap) this.b).get((View) obj)).intValue();
            default:
                return ((Integer) ((ArrayList) this.b).get(((Integer) obj).intValue())).intValue();
        }
    }
}
