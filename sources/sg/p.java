package sg;

import android.graphics.RectF;
import android.util.Pair;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Stories.ProfileStoriesView;
import xh.m8;
import zh.e3;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ p(int i10) {
        this.a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        switch (this.a) {
            case 0:
                return ((String) obj).compareTo((String) obj2);
            case 1:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 2:
                return ((y9.d0) ((y9.h1) obj)).a.compareTo(((y9.d0) ((y9.h1) obj2)).a);
            case 3:
                i10 = ((b2.s) obj2).j;
                i11 = ((b2.s) obj).j;
                break;
            case 4:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 5:
                return Integer.compare(((x2.f) ((List) obj).get(0)).f, ((x2.f) ((List) obj2).get(0)).f);
            case 6:
                List list = (List) obj;
                List list2 = (List) obj2;
                int i12 = 9;
                int i13 = 10;
                return e9.x.f(x2.o.c((x2.o) Collections.max(list, new p(i12)), (x2.o) Collections.max(list2, new p(i12)))).a(list.size(), list2.size()).b((x2.o) Collections.max(list, new p(i13)), (x2.o) Collections.max(list2, new p(i13)), new p(i13)).e();
            case 7:
                return ((x2.e) Collections.max((List) obj)).compareTo((x2.e) Collections.max((List) obj2));
            case 8:
                return ((x2.l) ((List) obj).get(0)).compareTo((x2.l) ((List) obj2).get(0));
            case 9:
                return x2.o.c((x2.o) obj, (x2.o) obj2);
            case 10:
                x2.o oVar = (x2.o) obj;
                x2.o oVar2 = (x2.o) obj2;
                boolean z10 = oVar.e;
                int i14 = oVar.s;
                e9.y0 a2 = (z10 && oVar.n) ? x2.p.l : x2.p.l.a();
                boolean z11 = oVar.f.B;
                e9.z zVar = e9.z.a;
                if (z11) {
                    zVar = zVar.b(Integer.valueOf(i14), Integer.valueOf(oVar2.s), x2.p.l.a());
                }
                return zVar.b(Integer.valueOf(oVar.v), Integer.valueOf(oVar2.v), a2).b(Integer.valueOf(i14), Integer.valueOf(oVar2.s), a2).e();
            case 11:
                RectF rectF = (RectF) obj;
                RectF rectF2 = (RectF) obj2;
                if (Math.abs(rectF.top - rectF2.top) > 1.0E-4f) {
                    if (rectF.top < rectF2.top) {
                        return -1;
                    }
                } else {
                    if (Math.abs(rectF.left - rectF2.left) <= 1.0E-4f) {
                        return 0;
                    }
                    if (rectF.left < rectF2.left) {
                        return -1;
                    }
                }
                return 1;
            case 12:
                i10 = ((TL_stars.SavedStarGift) obj2).date;
                i11 = ((TL_stars.SavedStarGift) obj).date;
                break;
            case 13:
                i10 = ((TL_stars.SavedStarGift) obj2).date;
                i11 = ((TL_stars.SavedStarGift) obj).date;
                break;
            case 14:
                return (int) (((m8) obj2).d - ((m8) obj).d);
            case 15:
                return ((y2.r) obj).a - ((y2.r) obj2).a;
            case 16:
                return Float.compare(((y2.r) obj).c, ((y2.r) obj2).c);
            case 17:
                return Long.compare(((TLRPC.PollAnswer) obj).shuffle_hash ^ Long.MIN_VALUE, ((TLRPC.PollAnswer) obj2).shuffle_hash ^ Long.MIN_VALUE);
            case 18:
                return (int) (yg.q0.k((TLObject) obj) - yg.q0.k((TLObject) obj2));
            case 19:
                long j3 = ((yh.a) obj2).c;
                long j10 = ((yh.a) obj).c;
                if (j3 > j10) {
                    return 1;
                }
                return j3 < j10 ? -1 : 0;
            case 20:
                i10 = ((zh.k) obj2).b;
                i11 = ((zh.k) obj).b;
                break;
            case 21:
            case 23:
                i10 = ((zh.l0) obj2).c;
                i11 = ((zh.l0) obj).c;
                break;
            case 22:
                return (int) (((TL_phone.groupCallDonor) obj2).stars - ((TL_phone.groupCallDonor) obj).stars);
            case 24:
                return ((Integer) ((Pair) obj).first).intValue() - ((Integer) ((Pair) obj2).first).intValue();
            case 25:
                int i15 = ProfileStoriesView.s0;
                return (int) (((e3) obj2).i - ((e3) obj).i);
            default:
                return (int) (((Long) obj2).longValue() - ((Long) obj).longValue());
        }
        return i10 - i11;
    }
}
