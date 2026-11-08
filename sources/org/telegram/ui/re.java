package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.ToIntFunction;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class re implements ToIntFunction {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ re(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        int i7 = this.a;
        Object obj2 = this.b;
        switch (i7) {
            case 0:
                return ((Integer) ((HashMap) obj2).get((View) obj)).intValue();
            default:
                RectF rectF = ProfileActivity.S6;
                return ((Integer) ((ArrayList) obj2).get(((Integer) obj).intValue())).intValue();
        }
    }
}
