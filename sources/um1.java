// default package

import android.app.Activity;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class um1 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ um1(Object obj, long j, long j2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = j;
        this.c = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0086 A[LOOP:1: B:19:0x0082->B:21:0x0086, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ba  */
    @Override // p8c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        wjb wjbVar;
        SpannableStringBuilder spannableStringBuilder;
        int size;
        int i;
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                ((mu1) obj2).H9(this.b, this.c, (Long) obj);
                break;
            case 1:
                aq1 aq1Var = (aq1) obj2;
                Long l = (Long) obj;
                mu1 mu1Var = aq1Var.b;
                if (mu1Var.getParentActivity() != null) {
                    Activity parentActivity = mu1Var.getParentActivity();
                    String M0 = k96.M0(2131746098, null);
                    int i2 = hc2.p0(mu1Var.e) ? 2131746102 : 2131746103;
                    long j = this.b;
                    SpannableStringBuilder T2 = gl.T2(k96.a0(null, null, i2, cf3.s(j)));
                    String H = l.longValue() > 0 ? k96.H(',', "RemoveMessageFeeRefund", (int) l.longValue()) : null;
                    String M02 = k96.M0(2131751805, null);
                    tn1 tn1Var = new tn1(aq1Var, j, this.c, l, (byte) 1);
                    wjbVar = ((d) mu1Var).resourceProvider;
                    ij.f0(parentActivity, M0, T2, H, M02, tn1Var, wjbVar, true);
                    break;
                }
                break;
            default:
                upa upaVar = (upa) obj2;
                ArrayList arrayList = (ArrayList) obj;
                fm fmVar = upaVar.F;
                if (this.b == this.c) {
                    upaVar.e0 = arrayList;
                    fmVar.animate().alpha(upaVar.s ? 0.0f : upaVar.e0 != null ? 1.0f : 0.25f).setInterpolator(s33.h).setDuration(420L).start();
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
                                    spannableStringBuilder.setSpan(new gm(((TL_stars.starGiftAttributeModel) obj3).document, fmVar.getPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                                    spannableStringBuilder.append((CharSequence) " ");
                                }
                                if (spannableStringBuilder.length() > 0) {
                                    spannableStringBuilder.append((CharSequence) " ");
                                }
                                spannableStringBuilder.append((CharSequence) gl.F2(k96.M0(2131749738, null), false, gl.L(1.0f), gl.L(1.0f)));
                                fmVar.setText(spannableStringBuilder);
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
                    spannableStringBuilder.append((CharSequence) gl.F2(k96.M0(2131749738, null), false, gl.L(1.0f), gl.L(1.0f)));
                    fmVar.setText(spannableStringBuilder);
                }
                break;
        }
    }
}
