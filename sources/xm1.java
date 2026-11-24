// default package

import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.function.ToIntFunction;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class xm1 implements ToIntFunction {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xm1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return ((Integer) ((HashMap) obj2).get((View) obj)).intValue();
            case 1:
                RectF rectF = ProfileActivity.e7;
                return ((Integer) ((ArrayList) obj2).get(((Integer) obj).intValue())).intValue();
            case 2:
                return ((SpannableStringBuilder) obj2).getSpanStart((rj9) obj);
            default:
                return ((int[]) ((IdentityHashMap) obj2).get((TL_iv.pageTableCell) obj))[1];
        }
    }
}
