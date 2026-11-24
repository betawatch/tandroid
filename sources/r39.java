// default package

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.SessionsActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class r39 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r39(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03a0  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        ly9 ly9Var;
        k6d k6dVar;
        zi ziVar;
        TL_stars.SavedStarGift savedStarGift;
        k1b i;
        byte b = 21;
        k6d k6dVar2 = null;
        CharSequence charSequence = null;
        r12 = null;
        gpa gpaVar = null;
        boolean z = false;
        switch (this.a) {
            case 0:
                y39 y39Var = (y39) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                ArrayList arrayList = y39Var.S1;
                if (!arrayList.isEmpty()) {
                    d15 d15Var = y39Var.V1;
                    if (!d15Var.R) {
                        d15Var.setLoading(true);
                        ArrayList arrayList2 = new ArrayList();
                        HashSet hashSet = new HashSet();
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) obj;
                            arrayList2.add(Integer.valueOf(tL_myBoost.slot));
                            hashSet.add(Long.valueOf(pg3.n(tL_myBoost.peer)));
                        }
                        oo0.a(chat.id, arrayList2, new jv0((Object) y39Var, (Object) chat, (Object) arrayList2, (Object) hashSet, (byte) 17), new ci7(y39Var, (byte) 27));
                        break;
                    }
                }
                break;
            case 1:
                zb9 zb9Var = (zb9) this.b;
                if (((fb9) this.c).n > 0) {
                    zb9Var.presentFragment(new nxa());
                    break;
                }
                break;
            case 2:
                yb9 yb9Var = (yb9) this.b;
                xb9 xb9Var = (xb9) this.c;
                bu5 G = bu5.G(yb9Var.c, yb9Var.J0, yb9Var.V1);
                G.b(R.drawable.menu_sort_value, jb6.M0(2131745872, null), new tb9(xb9Var, (byte) 3), false);
                G.b(R.drawable.menu_sort_date, jb6.M0(2131745876, null), new tb9(xb9Var, (byte) 4), false);
                G.b(R.drawable.menu_sort_number, jb6.M0(2131745874, null), new tb9(xb9Var, (byte) 5), false);
                G.t = false;
                G.b0 = true;
                G.b0(0.0f, gm.L(-8.0f));
                G.a0();
                break;
            case 3:
                ((jf9) this.b).k0((Context) this.c, view);
                break;
            case 4:
                ly9 ly9Var2 = (ly9) this.b;
                Context context = (Context) this.c;
                if (ly9Var2.x == null) {
                    boolean[] zArr = new boolean[1];
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    xr8 xr8Var = new xr8(ly9Var2, zArr, (byte) 17);
                    Pattern pattern = ik.a;
                    if (context == null) {
                        ly9Var = ly9Var2;
                    } else {
                        int w0 = cmb.w0(null, cmb.i5, false);
                        int w02 = cmb.w0(null, cmb.g5, false);
                        cmb.w0(null, cmb.zj, false);
                        cmb.w0(null, cmb.Dj, false);
                        cmb.w0(null, cmb.D8, false);
                        cmb.w0(null, cmb.F8, false);
                        cmb.w0(null, cmb.h6, false);
                        int w03 = cmb.w0(null, cmb.Ii, false);
                        int w04 = cmb.w0(null, cmb.Ei, false);
                        int w05 = cmb.w0(null, cmb.Gi, false);
                        k6d k6dVar3 = new k6d(context, (ylb) null);
                        ((my0) k6dVar3.b).w0 = false;
                        lp7 lp7Var = new lp7(context, null);
                        lp7Var.setTextColor(w0);
                        lp7Var.setTextOffset(gm.L(10.0f));
                        lp7Var.setItemCount(5);
                        nj njVar = new nj(context, null);
                        njVar.setItemCount(5);
                        njVar.setTextColor(w0);
                        njVar.setTextOffset(-gm.L(10.0f));
                        oj ojVar = new oj(context, null);
                        ojVar.setItemCount(5);
                        ojVar.setTextColor(w0);
                        ojVar.setTextOffset(-gm.L(34.0f));
                        zi ziVar2 = new zi(context, lp7Var, njVar, ojVar, (byte) 4);
                        ziVar2.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(context);
                        ziVar2.addView(frameLayout, qoe.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView = new TextView(context);
                        textView.setText(jb6.M0(2131745260, null));
                        textView.setTextColor(w0);
                        ts2.s(textView, 1, 20.0f);
                        frameLayout.addView(textView, qoe.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView.setOnTouchListener(new p8((byte) 2));
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        ziVar2.addView(linearLayout, qoe.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                        Calendar calendar = Calendar.getInstance();
                        wb wbVar = new wb(context, (byte) 4);
                        linearLayout.addView(lp7Var, qoe.l(0.5f, 0, nm7.s4));
                        lp7Var.setMinValue(0);
                        lp7Var.setMaxValue(365);
                        lp7Var.setWrapSelectorWheel(false);
                        lp7Var.setFormatter(new c((byte) 20));
                        jf jfVar = new jf((Object) lp7Var, (Object) njVar, (Object) ojVar, (byte) 1);
                        lp7Var.setOnValueChangedListener(jfVar);
                        njVar.setMinValue(0);
                        njVar.setMaxValue(23);
                        linearLayout.addView(njVar, qoe.l(0.2f, 0, nm7.s4));
                        njVar.setFormatter(new c((byte) 21));
                        njVar.setOnValueChangedListener(jfVar);
                        ojVar.setMinValue(0);
                        ojVar.setMaxValue(59);
                        ojVar.setValue(0);
                        ojVar.setFormatter(new c((byte) 22));
                        linearLayout.addView(ojVar, qoe.l(0.3f, 0, nm7.s4));
                        ojVar.setOnValueChangedListener(jfVar);
                        if (currentTimeMillis <= 0 || currentTimeMillis == 2147483646) {
                            ly9Var = ly9Var2;
                            k6dVar = k6dVar3;
                            ziVar = ziVar2;
                        } else {
                            long j = currentTimeMillis * 1000;
                            k6dVar = k6dVar3;
                            ly9Var = ly9Var2;
                            calendar.setTimeInMillis(System.currentTimeMillis());
                            calendar.set(12, 0);
                            calendar.set(13, 0);
                            calendar.set(14, 0);
                            calendar.set(11, 0);
                            ziVar = ziVar2;
                            int timeInMillis = (int) ((j - calendar.getTimeInMillis()) / 86400000);
                            calendar.setTimeInMillis(j);
                            if (timeInMillis >= 0) {
                                ojVar.setValue(calendar.get(12));
                                njVar.setValue(calendar.get(11));
                                lp7Var.setValue(timeInMillis);
                            }
                        }
                        ik.g(null, null, 0L, 0L, 0, lp7Var, njVar, ojVar);
                        wbVar.setPadding(gm.L(34.0f), 0, gm.L(34.0f), 0);
                        wbVar.setGravity(17);
                        wbVar.setTextColor(w03);
                        wbVar.setTextSize(1, 14.0f);
                        wbVar.setTypeface(gm.o());
                        int L = gm.L(8.0f);
                        wbVar.setBackgroundDrawable(cmb.i0(L, L, L, L, w04, w05, w05));
                        wbVar.setText(jb6.M0(2131745262, null));
                        zi ziVar3 = ziVar;
                        ziVar3.addView(wbVar, qoe.t(-1, 48, 83, 16, 15, 16, 16));
                        k6d k6dVar4 = k6dVar;
                        wbVar.setOnClickListener(new gg(lp7Var, njVar, ojVar, calendar, xr8Var, k6dVar4, (byte) 0));
                        my0 my0Var = (my0) k6dVar4.b;
                        my0Var.O = ziVar3;
                        my0Var.show();
                        my0Var.s0(w02);
                        my0Var.K(w02);
                        k6dVar2 = k6dVar4;
                    }
                    dg dgVar = new dg(ly9Var, zArr, (byte) 14);
                    my0 my0Var2 = (my0) k6dVar2.b;
                    my0Var2.I0 = dgVar;
                    my0Var2.show();
                    ly9Var.x = my0Var2;
                    ly9Var.a(false);
                    break;
                }
                break;
            case 5:
                p0a p0aVar = (p0a) this.b;
                h71 h71Var = (h71) this.c;
                HashSet hashSet2 = p0aVar.U1;
                if (!hashSet2.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = hashSet2.iterator();
                    while (it.hasNext()) {
                        long longValue = ((Long) it.next()).longValue();
                        ArrayList arrayList4 = p0aVar.T1.l;
                        int size2 = arrayList4.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 < size2) {
                                Object obj2 = arrayList4.get(i3);
                                i3++;
                                savedStarGift = (TL_stars.SavedStarGift) obj2;
                                int i4 = savedStarGift.msg_id;
                                if ((i4 == 0 || i4 != longValue) && savedStarGift.saved_id != longValue) {
                                }
                            } else {
                                savedStarGift = null;
                            }
                        }
                        if (savedStarGift != null) {
                            arrayList3.add(savedStarGift);
                        }
                    }
                    h71Var.a(arrayList3);
                    p0aVar.dismiss();
                    break;
                }
                break;
            case 6:
                o0a o0aVar = (o0a) this.b;
                n0a n0aVar = (n0a) this.c;
                ava avaVar = o0aVar.c.T1;
                avaVar.e = !avaVar.e;
                n0aVar.run();
                avaVar.k(true);
                break;
            case 7:
                s0a s0aVar = (s0a) this.b;
                js7 js7Var = (js7) this.c;
                if (s0aVar.U1.g() != 0) {
                    js7Var.a(new ArrayList(s0aVar.V1.values()));
                    s0aVar.dismiss();
                    break;
                }
                break;
            case 8:
                q2a q2aVar = (q2a) this.b;
                ts9 ts9Var = (ts9) this.c;
                b61 b61Var = q2aVar.p1;
                if (b61Var.e0 && !b61Var.R) {
                    gm.t1(q2aVar.m1);
                    b61Var.setLoading(true);
                    ts9Var.a(q2aVar.y1);
                    break;
                }
                break;
            case 9:
                SessionsActivity sessionsActivity = (SessionsActivity) this.b;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.c;
                sessionsActivity.getClass();
                alertDialog$Builder.a.M0.run();
                Integer num = (Integer) view.getTag();
                int i5 = num.intValue() == 0 ? 7 : num.intValue() == 1 ? 90 : num.intValue() == 2 ? nm7.M2 : num.intValue() == 3 ? 365 : 0;
                TL_account.setAuthorizationTTL setauthorizationttl = new TL_account.setAuthorizationTTL();
                setauthorizationttl.authorization_ttl_days = i5;
                sessionsActivity.s = i5;
                h9a h9aVar = sessionsActivity.a;
                if (h9aVar != null) {
                    h9aVar.f();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new nf2(r13));
                break;
            case 10:
                ana anaVar = (ana) this.b;
                zma zmaVar = (zma) this.c;
                if (zmaVar.P) {
                    boolean x = DictationAsr.x();
                    String str = zmaVar.a;
                    if (x) {
                        DictationAsr.Z(str);
                    } else {
                        boolean z2 = DictationAsr.z(str);
                        StringBuilder sb = new StringBuilder();
                        String[] G2 = DictationAsr.G();
                        int length = G2.length;
                        while (r13 < length) {
                            String str2 = G2[r13];
                            if (str2.equals(str)) {
                                r13 = z2 ? r13 + 1 : (byte) 0;
                                if (sb.length() > 0) {
                                    sb.append(',');
                                }
                                sb.append(str2);
                            } else {
                                if (!DictationAsr.z(str2)) {
                                }
                                if (sb.length() > 0) {
                                }
                                sb.append(str2);
                            }
                        }
                        SharedPreferences.Editor putString = oc7.d1().edit().putString("asr_langs", sb.toString());
                        if (sb.length() == 0) {
                            putString.putBoolean("asr_auto", true);
                        }
                        putString.apply();
                    }
                } else if (!zmaVar.Q) {
                    DictationAsr.s(zmaVar.f);
                }
                zmaVar.c();
                anaVar.e0();
                break;
            case 11:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.b;
                editTextBoldCursor.setText(nxa.K0(((Long) this.c).longValue()));
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                break;
            case 12:
                kpa kpaVar = (kpa) this.b;
                ArrayList<TL_stars.StarGiftAttribute> arrayList5 = (ArrayList) this.c;
                epa epaVar = kpaVar.j2;
                int i6 = kpaVar.u2;
                if (i6 == 2) {
                    epaVar.setPreviewingAttributes(arrayList5);
                    kpaVar.b1(1);
                    break;
                } else if (i6 == 1) {
                    gpa gpaVar2 = new gpa(epaVar.getUpgradeBackdropAttribute(), epaVar.getUpgradePatternAttribute(), epaVar.getUpgradeImageViewAttribute());
                    kpaVar.o2 = gpaVar2;
                    epaVar.setPreviewAttributes(gpaVar2);
                    kpaVar.b1(2);
                    break;
                }
                break;
            case 13:
                fpa fpaVar = (fpa) this.b;
                gpa gpaVar3 = (gpa) this.c;
                kpa kpaVar2 = fpaVar.Q;
                int i7 = kpaVar2.u2;
                epa epaVar2 = kpaVar2.j2;
                if (i7 == 1) {
                    kpaVar2.o2 = new gpa(epaVar2.getUpgradeBackdropAttribute(), epaVar2.getUpgradePatternAttribute(), epaVar2.getUpgradeImageViewAttribute());
                    kpaVar2.b1(2);
                }
                int i8 = kpaVar2.e2.s;
                gpa gpaVar4 = kpaVar2.o2;
                if (gpaVar4 != null) {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = gpaVar4.a;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = gpaVar4.c;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = gpaVar4.b;
                    if (i8 == 1) {
                        gpaVar = new gpa(gpaVar3.a, stargiftattributepattern, stargiftattributemodel);
                    } else if (i8 == 2) {
                        gpaVar = new gpa(stargiftattributebackdrop, gpaVar3.b, stargiftattributemodel);
                    } else if (i8 == 0) {
                        gpaVar = new gpa(stargiftattributebackdrop, stargiftattributepattern, gpaVar3.c);
                    }
                }
                kpaVar2.o2 = gpaVar;
                epaVar2.setPreviewAttributes(gpaVar);
                kpaVar2.d1();
                break;
            case 14:
                wsa wsaVar = (wsa) this.b;
                oh2 oh2Var = (oh2) this.c;
                boolean z3 = !wsaVar.v3;
                wsaVar.v3 = z3;
                oh2Var.c(z3, true);
                break;
            case 15:
                l11.w(((wsa) this.b).getContext(), ((TL_stars.UniqueStarGiftValueInfo) this.c).fragment_listed_url, false);
                break;
            case 16:
                ((wsa) this.b).t2((CharSequence) this.c);
                break;
            case 17:
                ura uraVar = (ura) this.b;
                ylb ylbVar = (ylb) this.c;
                if (uraVar.F.getAlpha() >= 1.0f && !uraVar.i0 && !uraVar.k0 && uraVar.e0 != null) {
                    new kpa(uraVar.getContext(), ylbVar, uraVar.a0, uraVar.d0, uraVar.e0, true).show();
                    break;
                }
                break;
            case 18:
                l11.u((Context) this.b, ((TL_stars.StarsTransaction) this.c).transaction_url);
                break;
            case 19:
                bza bzaVar = (bza) this.b;
                uza uzaVar = (uza) this.c;
                xza xzaVar = bzaVar.e0;
                xzaVar.getOrCreateStoryViewer().G(xzaVar.getParentActivity(), uzaVar.b(), xzaVar.D0, q4b.a(xzaVar.T));
                break;
            case 20:
                fza fzaVar = (fza) this.b;
                l46 l46Var = (l46) this.c;
                int i9 = fzaVar.c;
                gza gzaVar = fzaVar.d;
                sk4 sk4Var = fzaVar.a;
                if (sk4Var.c) {
                    ArrayList arrayList6 = gzaVar.n;
                    ng0 ng0Var = gzaVar.c;
                    int size3 = arrayList6.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size3) {
                            z = true;
                        } else if (i10 == i9 || !((fza) arrayList6.get(i10)).a.c || !((fza) arrayList6.get(i10)).a.b) {
                            i10++;
                        }
                    }
                    gzaVar.f();
                    if (z) {
                        gm.z3(sk4Var);
                        break;
                    } else {
                        sk4Var.setChecked(!sk4Var.b);
                        l46Var.n = sk4Var.b;
                        gzaVar.b.z();
                        if (gzaVar.r.c > 0 && i9 < ng0Var.d.size()) {
                            ((l46) ng0Var.d.get(i9)).n = sk4Var.b;
                            ng0Var.z();
                            break;
                        }
                    }
                }
                break;
            case 21:
                n1b n1bVar = (n1b) this.b;
                z52 z52Var = (z52) this.c;
                k1b[] k1bVarArr = n1bVar.I;
                if (k1bVarArr != null && k1bVarArr.length != 0 && n1bVar.J != null && (i = n1bVar.i(n1bVar.o0, n1bVar.p0)) != null) {
                    z52Var.a(i);
                    break;
                }
                break;
            case 22:
                t2b t2bVar = (t2b) this.b;
                y0b y0bVar = (y0b) this.c;
                hx2.e().k(t2bVar.r.g2);
                hx2.e().m(y0bVar);
                break;
            case 23:
                u6b u6bVar = (u6b) this.b;
                uva uvaVar = (uva) this.c;
                su3 su3Var = u6bVar.T1;
                try {
                    charSequence = ((ClipboardManager) u6bVar.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(u6bVar.getContext());
                } catch (Exception e) {
                    fc4.g(e, true);
                }
                if (charSequence != null) {
                    su3Var.d.setText(charSequence.toString());
                    ru3 ru3Var = su3Var.d;
                    ru3Var.setSelection(0, ru3Var.getText().length());
                }
                uvaVar.run();
                break;
            case 24:
                v9b v9bVar = (v9b) this.b;
                new h7b((Activity) this.c, v9bVar.c, true, v9bVar.y0, new g8b(v9bVar, b), v9bVar.a).show();
                break;
            case 25:
                ((sk3) this.b).a((TLRPC.TL_payments_checkedGiftCode) this.c);
                break;
            case 26:
                ((sk3) this.b).a((TLRPC.Chat) this.c);
                break;
            case 27:
                CharSequence charSequence2 = (CharSequence) this.b;
                uva uvaVar2 = (uva) this.c;
                gm.g(charSequence2);
                uvaVar2.run();
                break;
            case 28:
                my0 my0Var3 = (my0) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                my0Var3.dismiss();
                if (!zArr2[0]) {
                    oc7.d1().edit().putInt("showchattagsinfo", 0).apply();
                    zArr2[0] = true;
                    break;
                }
                break;
            default:
                zob zobVar = (zob) this.b;
                Context context2 = (Context) this.c;
                if (zobVar.getParentActivity() != null) {
                    k6d k6dVar5 = new k6d(zobVar.getParentActivity(), (ylb) null);
                    ((my0) k6dVar5.b).w0 = false;
                    LinearLayout i11 = hg9.i(context2, 1);
                    TextView textView2 = new TextView(context2);
                    textView2.setText(jb6.M0(2131752049, null));
                    td4.x(textView2, cmb.i5, null, 1, 20.0f);
                    i11.addView(textView2, qoe.t(-1, -2, 51, 22, 12, 22, 4));
                    textView2.setOnTouchListener(new xob((byte) 0));
                    ((my0) k6dVar5.b).O = i11;
                    ArrayList arrayList7 = new ArrayList();
                    int size4 = cmb.F.size();
                    for (int i12 = 0; i12 < size4; i12++) {
                        bmb bmbVar = (bmb) cmb.F.get(i12);
                        TLRPC.TL_theme tL_theme = bmbVar.G;
                        if (tL_theme == null || tL_theme.document != null) {
                            arrayList7.add(bmbVar);
                        }
                    }
                    rmb rmbVar = new rmb(context2, zobVar, arrayList7, new ArrayList(), k6dVar5);
                    i11.addView(rmbVar, qoe.k(0.0f, 7.0f, 0.0f, 1.0f, -1, nm7.d2));
                    rmbVar.A1(zobVar.fragmentView.getMeasuredWidth());
                    zobVar.showDialog((my0) k6dVar5.b);
                    break;
                }
                break;
        }
    }
}
