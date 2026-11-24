// default package

import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.View;
import java.util.Comparator;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.ProfileStoriesView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class qx7 implements Comparator {
    public final /* synthetic */ byte a;

    public /* synthetic */ qx7(byte b) {
        this.a = b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((Integer) obj2).intValue() - ((Integer) obj).intValue();
            case 1:
                int h1 = xz7.h1((String) obj);
                int h12 = xz7.h1((String) obj2);
                if (h1 < h12) {
                    return -1;
                }
                return h1 > h12 ? 1 : 0;
            case 2:
                int h13 = xz7.h1((String) obj);
                int h14 = xz7.h1((String) obj2);
                if (h13 < h14) {
                    return -1;
                }
                return h13 > h14 ? 1 : 0;
            case 3:
                Drawable[] drawableArr = PhotoViewer.d9;
                return ((k47) obj).e1() - ((k47) obj2).e1();
            case 4:
                float f = ((fh8) obj).a;
                float f2 = ((fh8) obj2).a;
                if (f > f2) {
                    return -1;
                }
                return f < f2 ? 1 : 0;
            case 5:
                return (int) ((((rk8) obj).a * 100.0f) - (((rk8) obj2).a * 100.0f));
            case 6:
                return (int) (((View) obj).getY() - ((View) obj2).getY());
            case 7:
                int i = obj instanceof tq8 ? ((tq8) obj).g : obj instanceof bc7 ? ((bc7) obj).d : 0;
                int i2 = obj2 instanceof tq8 ? ((tq8) obj2).g : obj2 instanceof bc7 ? ((bc7) obj2).d : 0;
                if (i < i2) {
                    return -1;
                }
                return i > i2 ? 1 : 0;
            case 8:
                int i3 = ProfileStoriesView.t0;
                return (int) (((au8) obj2).i - ((au8) obj).i);
            case 9:
                return Long.compare(((fda) obj).b, ((fda) obj2).b);
            case 10:
                return ((oz8) obj).c - ((oz8) obj2).c;
            case 11:
                return (int) (l39.j((TLObject) obj) - l39.j((TLObject) obj2));
            case 12:
                return Float.compare(((n59) obj).a, ((n59) obj2).a);
            case 13:
                return ((ni9) obj).d - ((ni9) obj2).d;
            case 14:
                return ((vr9) obj2).c() - ((vr9) obj).c();
            case 15:
                return ((vr9) obj).k - ((vr9) obj2).k;
            case 16:
                return ((vr9) obj2).c() - ((vr9) obj).c();
            case 17:
                int i4 = ((zt9) obj).b;
                int i5 = ((zt9) obj2).b;
                if (i4 < i5) {
                    return 1;
                }
                return i4 > i5 ? -1 : 0;
            case 18:
                int i6 = ((cw9) obj).b.out_seq_no;
                int i7 = ((cw9) obj2).b.out_seq_no;
                if (i6 > i7) {
                    return 1;
                }
                return i6 < i7 ? -1 : 0;
            case 19:
                return gm.A(((TLRPC.Message) obj).seq_out, ((TLRPC.Message) obj2).seq_out);
            case 20:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                if (((Float) pair.first).floatValue() > ((Float) pair2.first).floatValue()) {
                    return 1;
                }
                return ((Float) pair2.first).floatValue() > ((Float) pair.first).floatValue() ? -1 : 0;
            case 21:
                Pair pair3 = (Pair) obj;
                Pair pair4 = (Pair) obj2;
                if (((Float) pair3.first).floatValue() > ((Float) pair4.first).floatValue()) {
                    return 1;
                }
                return ((Float) pair4.first).floatValue() > ((Float) pair3.first).floatValue() ? -1 : 0;
            case 22:
                return ((f90) ((tz2) obj)).a.compareTo(((f90) ((tz2) obj2)).a);
            case 23:
                long j = z8c.h(((Integer) obj).intValue()).Z;
                long j2 = z8c.h(((Integer) obj2).intValue()).Z;
                if (j > j2) {
                    return 1;
                }
                return j < j2 ? -1 : 0;
            case 24:
                int i8 = ((ica) obj).c;
                int i9 = ((ica) obj2).c;
                if (i8 < i9) {
                    return 1;
                }
                return i8 > i9 ? -1 : 0;
            case 25:
                fda fdaVar = (fda) obj;
                fda fdaVar2 = (fda) obj2;
                fda fdaVar3 = gda.x1;
                long j3 = fdaVar3 == fdaVar ? -200000L : 0L;
                if (!fdaVar.d) {
                    j3 += 100000;
                }
                long j4 = fdaVar3 == fdaVar2 ? -200000L : 0L;
                if (!fdaVar2.d) {
                    j4 += 100000;
                }
                return Long.compare(fdaVar.b + j3, fdaVar2.b + j4);
            case 26:
                return ((nga) obj2).c - ((nga) obj).c;
            case 27:
                return ((nla) obj).a - ((nla) obj2).a;
            case 28:
                return Float.compare(((nla) obj).c, ((nla) obj2).c);
            default:
                return ((TL_stars.SavedStarGift) obj2).date - ((TL_stars.SavedStarGift) obj).date;
        }
    }
}
