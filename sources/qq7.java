// default package

import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.View;
import java.util.Comparator;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.ProfileStoriesView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class qq7 implements Comparator {
    public final /* synthetic */ byte a;

    public /* synthetic */ qq7(byte b) {
        this.a = b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                long j = yac.h(((Integer) obj).intValue()).Z;
                long j2 = yac.h(((Integer) obj2).intValue()).Z;
                if (j > j2) {
                    return 1;
                }
                return j < j2 ? -1 : 0;
            case 1:
                return ((TL_account.TL_businessWeeklyOpen) obj).start_minute - ((TL_account.TL_businessWeeklyOpen) obj2).start_minute;
            case 2:
                return ((Integer) obj2).intValue() - ((Integer) obj).intValue();
            case 3:
                int h1 = b18.h1((String) obj);
                int h12 = b18.h1((String) obj2);
                if (h1 < h12) {
                    return -1;
                }
                return h1 > h12 ? 1 : 0;
            case 4:
                int h13 = b18.h1((String) obj);
                int h14 = b18.h1((String) obj2);
                if (h13 < h14) {
                    return -1;
                }
                return h13 > h14 ? 1 : 0;
            case 5:
                Drawable[] drawableArr = PhotoViewer.d9;
                return ((r47) obj).e1() - ((r47) obj2).e1();
            case 6:
                float f = ((ri8) obj).a;
                float f2 = ((ri8) obj2).a;
                if (f > f2) {
                    return -1;
                }
                return f < f2 ? 1 : 0;
            case 7:
                return (int) ((((cm8) obj).a * 100.0f) - (((cm8) obj2).a * 100.0f));
            case 8:
                return (int) (((View) obj).getY() - ((View) obj2).getY());
            case 9:
                int i = obj instanceof es8 ? ((es8) obj).g : obj instanceof hc7 ? ((hc7) obj).d : 0;
                int i2 = obj2 instanceof es8 ? ((es8) obj2).g : obj2 instanceof hc7 ? ((hc7) obj2).d : 0;
                if (i < i2) {
                    return -1;
                }
                return i > i2 ? 1 : 0;
            case 10:
                int i3 = ProfileStoriesView.t0;
                return (int) (((iv8) obj2).i - ((iv8) obj).i);
            case 11:
                return Long.compare(((wea) obj).b, ((wea) obj2).b);
            case 12:
                return ((a19) obj).c - ((a19) obj2).c;
            case 13:
                return (int) (x49.j((TLObject) obj) - x49.j((TLObject) obj2));
            case 14:
                return Float.compare(((z69) obj).a, ((z69) obj2).a);
            case 15:
                return ((ak9) obj).d - ((ak9) obj2).d;
            case 16:
                return ((mt9) obj2).c() - ((mt9) obj).c();
            case 17:
                return ((mt9) obj).k - ((mt9) obj2).k;
            case 18:
                return ((mt9) obj2).c() - ((mt9) obj).c();
            case 19:
                int i4 = ((qv9) obj).b;
                int i5 = ((qv9) obj2).b;
                if (i4 < i5) {
                    return 1;
                }
                return i4 > i5 ? -1 : 0;
            case 20:
                return hl.A(((TLRPC.Message) obj).seq_out, ((TLRPC.Message) obj2).seq_out);
            case 21:
                int i6 = ((vx9) obj).b.out_seq_no;
                int i7 = ((vx9) obj2).b.out_seq_no;
                if (i6 > i7) {
                    return 1;
                }
                return i6 < i7 ? -1 : 0;
            case 22:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                if (((Float) pair.first).floatValue() > ((Float) pair2.first).floatValue()) {
                    return 1;
                }
                return ((Float) pair2.first).floatValue() > ((Float) pair.first).floatValue() ? -1 : 0;
            case 23:
                Pair pair3 = (Pair) obj;
                Pair pair4 = (Pair) obj2;
                if (((Float) pair3.first).floatValue() > ((Float) pair4.first).floatValue()) {
                    return 1;
                }
                return ((Float) pair4.first).floatValue() > ((Float) pair3.first).floatValue() ? -1 : 0;
            case 24:
                return ((h80) ((dz2) obj)).a.compareTo(((h80) ((dz2) obj2)).a);
            case 25:
                long j3 = yac.h(((Integer) obj).intValue()).Z;
                long j4 = yac.h(((Integer) obj2).intValue()).Z;
                if (j3 > j4) {
                    return 1;
                }
                return j3 < j4 ? -1 : 0;
            case 26:
                int i8 = ((zda) obj).c;
                int i9 = ((zda) obj2).c;
                if (i8 < i9) {
                    return 1;
                }
                return i8 > i9 ? -1 : 0;
            case 27:
                wea weaVar = (wea) obj;
                wea weaVar2 = (wea) obj2;
                wea weaVar3 = xea.x1;
                long j5 = weaVar3 == weaVar ? -200000L : 0L;
                if (!weaVar.d) {
                    j5 += 100000;
                }
                long j6 = weaVar3 == weaVar2 ? -200000L : 0L;
                if (!weaVar2.d) {
                    j6 += 100000;
                }
                return Long.compare(weaVar.b + j5, weaVar2.b + j6);
            case 28:
                return ((eia) obj2).c - ((eia) obj).c;
            default:
                return ((gna) obj).a - ((gna) obj2).a;
        }
    }
}
