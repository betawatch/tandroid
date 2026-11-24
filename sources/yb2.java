// default package

import android.text.Spanned;
import java.util.Comparator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class yb2 implements Comparator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Spanned b;

    public /* synthetic */ yb2(Spanned spanned, byte b) {
        this.a = b;
        this.b = spanned;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int spanStart;
        int spanStart2;
        byte b = this.a;
        Spanned spanned = this.b;
        switch (b) {
            case 0:
                spanStart = spanned.getSpanStart((bl2) obj2);
                spanStart2 = spanned.getSpanStart((bl2) obj);
                break;
            case 1:
                spanStart = spanned.getSpanStart((lkb) obj2);
                spanStart2 = spanned.getSpanStart((lkb) obj);
                break;
            default:
                spanStart = spanned.getSpanStart((ti9) obj2);
                spanStart2 = spanned.getSpanStart((ti9) obj);
                break;
        }
        return spanStart - spanStart2;
    }
}
