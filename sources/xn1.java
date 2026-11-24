// default package

import android.app.Activity;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class xn1 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xn1(Object obj, long j, long j2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = j;
        this.c = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0086 A[LOOP:1: B:19:0x0082->B:21:0x0086, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ba  */
    @Override // qac
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        ylb ylbVar;
        SpannableStringBuilder spannableStringBuilder;
        int size;
        int i;
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                ((yv1) obj2).T9(this.b, this.c, (Long) obj);
                break;
            case 1:
                nr1 nr1Var = (nr1) obj2;
                Long l = (Long) obj;
                yv1 yv1Var = nr1Var.b;
                if (yv1Var.getParentActivity() != null) {
                    Activity parentActivity = yv1Var.getParentActivity();
                    String M0 = jb6.M0(2131746024, null);
                    int i2 = sd2.p0(yv1Var.e) ? 2131746028 : 2131746029;
                    long j = this.b;
                    SpannableStringBuilder S2 = gm.S2(jb6.a0(null, null, i2, pg3.s(j)));
                    String H = l.longValue() > 0 ? jb6.H(',', "RemoveMessageFeeRefund", (int) l.longValue()) : null;
                    String M02 = jb6.M0(2131751754, null);
                    dp1 dp1Var = new dp1(nr1Var, j, this.c, l, (byte) 1);
                    ylbVar = ((d) yv1Var).resourceProvider;
                    ik.f0(parentActivity, M0, S2, H, M02, dp1Var, ylbVar, true);
                    break;
                }
                break;
            default:
                ura uraVar = (ura) obj2;
                ArrayList arrayList = (ArrayList) obj;
                fn fnVar = uraVar.F;
                if (this.b == this.c) {
                    uraVar.e0 = arrayList;
                    fnVar.animate().alpha(uraVar.s ? 0.0f : uraVar.e0 != null ? 1.0f : 0.25f).setInterpolator(d53.h).setDuration(420L).start();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        if ((arrayList.get(i3) instanceof TL_stars.starGiftAttributeModel) && !(((TL_stars.StarGiftAttribute) arrayList.get(i3)).rarity instanceof TL_stars.TL_starGiftAttributeRarity)) {
                            arrayList2.add((TL_stars.starGiftAttributeModel) arrayList.get(i3));
                            if (arrayList2.size() >= 3) {
                                spannableStringBuilder = new SpannableStringBuilder();
                                size = arrayList2.size();
                                i = 0;
                                while (i < size) {
                                    Object obj3 = arrayList2.get(i);
                                    i++;
                                    spannableStringBuilder.append((CharSequence) "x");
                                    spannableStringBuilder.setSpan(new gn(((TL_stars.starGiftAttributeModel) obj3).document, fnVar.getPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                                    spannableStringBuilder.append((CharSequence) " ");
                                }
                                if (spannableStringBuilder.length() > 0) {
                                    spannableStringBuilder.append((CharSequence) " ");
                                }
                                spannableStringBuilder.append((CharSequence) gm.E2(jb6.M0(2131749687, null), false, gm.L(1.0f), gm.L(1.0f)));
                                fnVar.setText(spannableStringBuilder);
                                break;
                            }
                        }
                    }
                    spannableStringBuilder = new SpannableStringBuilder();
                    size = arrayList2.size();
                    i = 0;
                    while (i < size) {
                    }
                    if (spannableStringBuilder.length() > 0) {
                    }
                    spannableStringBuilder.append((CharSequence) gm.E2(jb6.M0(2131749687, null), false, gm.L(1.0f), gm.L(1.0f)));
                    fnVar.setText(spannableStringBuilder);
                }
                break;
        }
    }
}
