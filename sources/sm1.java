// default package

import android.app.Activity;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class sm1 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sm1(Object obj, long j, long j2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = j;
        this.c = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0086 A[LOOP:1: B:19:0x0082->B:21:0x0086, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ba  */
    @Override // pcc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        vnb vnbVar;
        SpannableStringBuilder spannableStringBuilder;
        int size;
        int i;
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                ((zu1) obj2).U9(this.b, this.c, (Long) obj);
                break;
            case 1:
                oq1 oq1Var = (oq1) obj2;
                Long l = (Long) obj;
                zu1 zu1Var = oq1Var.b;
                if (zu1Var.getParentActivity() != null) {
                    Activity parentActivity = zu1Var.getParentActivity();
                    String M0 = ob6.M0(2131746018, null);
                    int i2 = xc2.p0(zu1Var.e) ? 2131746022 : 2131746023;
                    long j = this.b;
                    SpannableStringBuilder S2 = hl.S2(ob6.a0(null, null, i2, wf3.s(j)));
                    String H = l.longValue() > 0 ? ob6.H(',', "RemoveMessageFeeRefund", (int) l.longValue()) : null;
                    String M02 = ob6.M0(2131751782, null);
                    fn1 fn1Var = new fn1(oq1Var, j, this.c, l, (byte) 1);
                    vnbVar = ((e) zu1Var).resourceProvider;
                    jj.f0(parentActivity, M0, S2, H, M02, fn1Var, vnbVar, true);
                    break;
                }
                break;
            default:
                vta vtaVar = (vta) obj2;
                ArrayList arrayList = (ArrayList) obj;
                gm gmVar = vtaVar.F;
                if (this.b == this.c) {
                    vtaVar.e0 = arrayList;
                    gmVar.animate().alpha(vtaVar.s ? 0.0f : vtaVar.e0 != null ? 1.0f : 0.25f).setInterpolator(k43.h).setDuration(420L).start();
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
                                    spannableStringBuilder.setSpan(new hm(((TL_stars.starGiftAttributeModel) obj3).document, gmVar.getPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                                    spannableStringBuilder.append((CharSequence) " ");
                                }
                                if (spannableStringBuilder.length() > 0) {
                                    spannableStringBuilder.append((CharSequence) " ");
                                }
                                spannableStringBuilder.append((CharSequence) hl.E2(ob6.M0(2131749700, null), false, hl.L(1.0f), hl.L(1.0f)));
                                gmVar.setText(spannableStringBuilder);
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
                    spannableStringBuilder.append((CharSequence) hl.E2(ob6.M0(2131749700, null), false, hl.L(1.0f), hl.L(1.0f)));
                    gmVar.setText(spannableStringBuilder);
                }
                break;
        }
    }
}
