// default package

import android.os.Looper;
import android.util.SparseArray;
import android.util.StateSet;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class zd implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zd(int i, Object obj, byte b) {
        this.a = b;
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:329:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0523  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        long j;
        int i2;
        int i3;
        File file;
        int i4;
        long j2;
        int i5;
        long j3;
        long j4;
        long j5;
        CharSequence S2;
        int i6;
        byte b = this.a;
        int i7 = 3;
        int i8 = 4;
        int i9 = 1;
        boolean z = false;
        boolean z2 = false;
        int i10 = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                p66 p66Var = (p66) obj;
                ArrayList v = lv2.r(i10).v(11);
                String M0 = ob6.M0(2131751206, null);
                if (v != null && !v.isEmpty()) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < v.size()) {
                            if (v.get(i11) instanceof TLRPC.TL_privacyValueAllowContacts) {
                                M0 = ob6.M0(2131751206, null);
                            } else {
                                if ((v.get(i11) instanceof TLRPC.TL_privacyValueAllowAll) || (v.get(i11) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                                    M0 = ob6.M0(2131751207, null);
                                }
                                i11++;
                            }
                        }
                    }
                }
                p66Var.setText(hl.E2(hl.N2(M0, -1, 0, new se(v, (byte) 0), null), true, hl.L(2.6666667f), hl.L(0.66f)));
                break;
            case 1:
                jn7.f(i10).k(4, new Object[0]);
                hl.d3(new ue((bf7) obj, (byte) 1), 250L);
                break;
            case 2:
                uc7.s1(i10).e3(0, ((TLRPC.Chat) obj).id, true);
                break;
            case 3:
                ((f00) obj).b.onAudioFocusChange(i10);
                break;
            case 4:
                p30 p30Var = (p30) ((lh2) obj).c;
                String str = gcc.a;
                lo loVar = ((n64) p30Var).a.C;
                m64 m64Var = new m64(i10);
                loVar.getClass();
                yve.p(Looper.myLooper() == ((xgb) loVar.c).a.getLooper());
                loVar.a++;
                loVar.j(new a30(loVar, m64Var, (byte) 5));
                loVar.p(Integer.valueOf(i10));
                break;
            case 5:
                File file2 = (File) obj;
                Set set = u60.a;
                long currentTimeMillis = System.currentTimeMillis();
                if (f11.a) {
                    cc4.b("checkKeepMedia start task");
                }
                ArrayList arrayList = new ArrayList();
                int i12 = 0;
                boolean z3 = false;
                while (i12 < 4) {
                    if (yac.h(i12).o()) {
                        w51 w51Var = yac.h(i12).getMessagesController().h4;
                        arrayList.add(w51Var);
                        if (w51Var.e().size() > 0) {
                            z3 = true;
                        }
                    }
                    i12++;
                    z3 = z3;
                }
                int[] iArr = new int[4];
                boolean z4 = true;
                long j6 = Long.MAX_VALUE;
                for (int i13 = 0; i13 < 4; i13++) {
                    int i14 = xea.q().getInt(uh9.k(i13, "keep_media_type_"), w51.b(i13));
                    iArr[i13] = i14;
                    if (i14 != 2) {
                        z4 = false;
                    }
                    long a = w51.a(i14);
                    if (a < j6) {
                        j6 = a;
                    }
                }
                if (z3) {
                    z4 = false;
                }
                SparseArray h = in5.z().h();
                long j7 = 0;
                int i15 = 0;
                int i16 = 0;
                while (i15 < h.size()) {
                    if (z4 && (h.keyAt(i15) == i9 || h.keyAt(i15) == i7)) {
                        i4 = i7;
                        j2 = currentTimeMillis;
                        i5 = i9;
                    } else {
                        int i17 = h.keyAt(i15) == i8 ? i9 : 0;
                        try {
                            File[] listFiles = ((File) h.valueAt(i15)).listFiles();
                            i4 = i7;
                            try {
                                ArrayList arrayList2 = new ArrayList();
                                if (listFiles != null) {
                                    for (int i18 = 0; i18 < listFiles.length; i18++) {
                                        if (!listFiles[i18].isDirectory() && !set.contains(listFiles[i18].getAbsolutePath())) {
                                            arrayList2.add(new v51(listFiles[i18]));
                                        }
                                    }
                                }
                                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                    ((w51) arrayList.get(i19)).g(arrayList2);
                                }
                                int i20 = 0;
                                while (i20 < arrayList2.size()) {
                                    v51 v51Var = (v51) arrayList2.get(i20);
                                    boolean z5 = v51Var.d;
                                    File file3 = v51Var.a;
                                    try {
                                        if (z5) {
                                            j4 = w51.a(iArr[i4]);
                                            j2 = currentTimeMillis;
                                        } else {
                                            j2 = currentTimeMillis;
                                            int i21 = v51Var.b;
                                            if (i21 == 2) {
                                                continue;
                                            } else {
                                                if (i21 >= 0) {
                                                    j3 = w51.a(i21);
                                                } else {
                                                    int i22 = v51Var.c;
                                                    if (i22 >= 0) {
                                                        j3 = w51.a(iArr[i22]);
                                                    } else if (i17 == 0) {
                                                        j3 = j6;
                                                    } else {
                                                        continue;
                                                    }
                                                }
                                                if (j3 != Long.MAX_VALUE) {
                                                    j4 = j3;
                                                } else {
                                                    continue;
                                                }
                                            }
                                            i20++;
                                            currentTimeMillis = j2;
                                        }
                                        long lastUsageFileTime = Utilities.getLastUsageFileTime(file3.getAbsolutePath());
                                        if (lastUsageFileTime > 316000000 && lastUsageFileTime < j5 && !set.contains(file3.getPath())) {
                                            try {
                                                if (f11.a) {
                                                    i16++;
                                                    j7 += file3.length();
                                                }
                                                file3.delete();
                                            } catch (Exception e) {
                                                cc4.g(e, true);
                                            }
                                        }
                                        i20++;
                                        currentTimeMillis = j2;
                                    } catch (Throwable th) {
                                        th = th;
                                        i5 = 1;
                                        cc4.g(th, true);
                                        i15++;
                                        i9 = i5;
                                        i7 = i4;
                                        currentTimeMillis = j2;
                                        i8 = 4;
                                    }
                                    j5 = i10 - j4;
                                }
                                j2 = currentTimeMillis;
                                i5 = 1;
                            } catch (Throwable th2) {
                                th = th2;
                                j2 = currentTimeMillis;
                                i5 = 1;
                                cc4.g(th, true);
                                i15++;
                                i9 = i5;
                                i7 = i4;
                                currentTimeMillis = j2;
                                i8 = 4;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            i4 = i7;
                        }
                    }
                    i15++;
                    i9 = i5;
                    i7 = i4;
                    currentTimeMillis = j2;
                    i8 = 4;
                }
                long j8 = currentTimeMillis;
                int i23 = i9;
                int i24 = xea.q().getInt("cache_limit", ConnectionsManager.DEFAULT_DATACENTER_ID);
                if (i24 != Integer.MAX_VALUE) {
                    long j9 = i24 == i23 ? 314572800L : (i24 << 20) * 1000;
                    long j10 = 0;
                    for (int i25 = 0; i25 < h.size(); i25++) {
                        j10 += Utilities.getDirSize(((File) h.valueAt(i25)).getAbsolutePath(), 0, true);
                    }
                    if (j10 > j9) {
                        ArrayList arrayList3 = new ArrayList();
                        for (int i26 = 0; i26 < h.size(); i26++) {
                            u60.a((File) h.valueAt(i26), arrayList3);
                        }
                        for (int i27 = 0; i27 < arrayList.size(); i27++) {
                            ((w51) arrayList.get(i27)).g(arrayList3);
                        }
                        Collections.sort(arrayList3, new ta((byte) 4));
                        j = 0;
                        int i28 = 0;
                        i2 = 0;
                        i3 = 0;
                        while (true) {
                            if (i28 < arrayList3.size()) {
                                if (((t60) arrayList3.get(i28)).b == 2) {
                                    i = i16;
                                } else {
                                    i = i16;
                                    if (((t60) arrayList3.get(i28)).e <= 0) {
                                        i2++;
                                    } else {
                                        long length = ((t60) arrayList3.get(i28)).a.length();
                                        j10 -= length;
                                        i3++;
                                        j += length;
                                        try {
                                            ((t60) arrayList3.get(i28)).a.delete();
                                        } catch (Exception unused) {
                                        }
                                        if (j10 >= j9) {
                                        }
                                    }
                                }
                                i28++;
                                i16 = i;
                            } else {
                                i = i16;
                            }
                        }
                        file = new File(file2, "acache");
                        if (file.exists()) {
                            try {
                                Utilities.clearDir(file.getAbsolutePath(), 0, i10 - 86400, false);
                            } catch (Throwable th4) {
                                cc4.g(th4, true);
                            }
                        }
                        uc7.e1().edit().putInt("lastKeepMediaCheckTime", xea.G).apply();
                        if (!f11.a) {
                            cc4.b("checkKeepMedia task end time " + (System.currentTimeMillis() - j8) + " auto deleted info: files " + i + " size " + hl.i0(j7, false, false) + "   deleted by size limit info: files " + i3 + " size " + hl.i0(j, false, false) + " unknownTimeFiles " + i2);
                            break;
                        }
                    }
                }
                i = i16;
                j = 0;
                i2 = 0;
                i3 = 0;
                file = new File(file2, "acache");
                if (file.exists()) {
                }
                uc7.e1().edit().putInt("lastKeepMediaCheckTime", xea.G).apply();
                if (!f11.a) {
                }
                break;
            case 6:
                ((x60) ((zm9) obj).b).Z(i10, true);
                break;
            case 7:
                ((guc) obj).B(i10);
                break;
            case 8:
                jd0 jd0Var = (jd0) obj;
                if (jd0Var.b) {
                    pcc pccVar = jd0Var.d;
                    if (pccVar != null) {
                        pccVar.a(Boolean.valueOf(i10 < 300));
                        try {
                            jd0Var.a.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                    }
                    jd0Var.c = true;
                    int max = Math.max(50, i10 - 100);
                    hl.d3(new zd((Object) jd0Var, max, (byte) 8), max);
                    break;
                }
                break;
            case 9:
                id[] idVarArr = (id[]) obj;
                id idVar = idVarArr[0];
                if (idVar != null) {
                    try {
                        idVar.setOnCancelListener(new j01(i10, z ? 1 : 0));
                        idVarArr[0].show();
                        break;
                    } catch (Exception unused3) {
                        return;
                    }
                }
                break;
            case 10:
                ub1 ub1Var = (ub1) obj;
                kg5 kg5Var = ub1Var.d1;
                if (ub1Var.b1 != i10) {
                    ub1Var.setTimer(i10);
                    pcc pccVar2 = ub1Var.r1;
                    if (pccVar2 != null) {
                        pccVar2.a(Integer.valueOf(i10));
                    }
                    if (i10 == 0) {
                        S2 = ob6.M0(ub1Var.q1 ? 2131743781 : 2131743786, null);
                        kg5Var.h = ub1Var.getMeasuredWidth();
                        kg5Var.p(false);
                        kg5Var.m(13.0f, 4.0f, 10.0f, 4.0f);
                        kg5Var.f0 = hl.L(0.0f);
                        kg5Var.e0 = -hl.L(1.0f);
                    } else if (i10 == Integer.MAX_VALUE) {
                        S2 = ob6.M0(ub1Var.q1 ? 2131743780 : 2131743785, null);
                        kg5Var.h = ub1Var.getMeasuredWidth();
                        kg5Var.p(false);
                        kg5Var.m(13.0f, 4.0f, 10.0f, 4.0f);
                        kg5Var.f0 = hl.L(0.0f);
                        kg5Var.e0 = -hl.L(1.0f);
                    } else if (i10 > 0) {
                        S2 = hl.S2(ob6.G(i10, ub1Var.q1 ? "TimerPeriodVideoSetSeconds" : "TimerPeriodPhotoSetSeconds", new Object[0]));
                        kg5Var.p(true);
                        kg5Var.h = kg5.a(S2, kg5Var.getTextPaint());
                        kg5Var.m(12.0f, 7.0f, 11.0f, 7.0f);
                        kg5Var.f0 = hl.L(2.0f);
                        kg5Var.e0 = 0.0f;
                    }
                    kg5Var.setTranslationY(((-Math.min(hl.L(34.0f), ub1Var.getEditTextHeight())) - hl.L(14.0f)) * (ub1Var instanceof qb8 ? -1.0f : 1.0f));
                    kg5Var.t(S2);
                    b29 b29Var = new b29(i10 > 0 ? R.raw.fire_on : R.raw.fire_off, hl.L(34.0f), hl.L(34.0f));
                    b29Var.start();
                    kg5Var.l(b29Var);
                    kg5Var.v();
                    ub1Var.o1 = false;
                    hl.r(ub1Var.p1);
                    ub1Var.invalidate();
                    break;
                }
                break;
            case 11:
                ((wb1) obj).a(Integer.valueOf(i10));
                break;
            case 12:
                ((wb1) obj).a(Integer.valueOf(i10));
                break;
            case 13:
                ((dj1) obj).f.c(i10);
                break;
            case 14:
                zu1 zu1Var = ((cq1) obj).g;
                if (zu1Var.lc == i10) {
                    zu1Var.hb();
                    break;
                }
                break;
            case 15:
                ((jq1) obj).a.J(this.b, 0, 0, 0, true, true);
                break;
            case 16:
                zu1 zu1Var2 = ((dq1) obj).g;
                if (zu1Var2.lc == i10) {
                    zu1Var2.hb();
                    break;
                }
                break;
            case 17:
                zu1 zu1Var3 = ((cq1) obj).g;
                if (zu1Var3.lc == i10) {
                    zu1Var3.hb();
                    break;
                }
                break;
            case 18:
                zu1 zu1Var4 = ((dq1) obj).g;
                if (zu1Var4.lc == i10) {
                    zu1Var4.hb();
                    break;
                }
                break;
            case 19:
                zu1 zu1Var5 = ((dq1) obj).g;
                if (zu1Var5.lc == i10) {
                    zu1Var5.hb();
                    break;
                }
                break;
            case 20:
                zu1 zu1Var6 = ((nt1) obj).x0;
                zu1Var6.C0.g1(i10, zu1Var6.O4);
                break;
            case 21:
                i6 = ((e) ((ju1) obj).a).currentAccount;
                ConnectionsManager.getInstance(i6).cancelRequest(i10, true);
                break;
            case 22:
                ((nnc) obj).a(Integer.valueOf(i10));
                break;
            case 23:
                ((nnc) obj).a(Integer.valueOf(i10));
                break;
            case 24:
                ha4 ha4Var = (ha4) obj;
                String i29 = ea4.i(i10);
                if (i29 != null) {
                    ea4.e.postRunnable(new x94(i29, ha4Var, z2 ? 1 : 0));
                    break;
                }
                break;
            case 25:
                b62 b62Var = (b62) obj;
                UndoView undoView = b62Var.Q.x;
                if (i10 == b62Var.P && undoView.isShown()) {
                    undoView.d(1, true);
                    break;
                }
                break;
            case 26:
                zm9 zm9Var = (zm9) obj;
                zm9Var.getClass();
                try {
                    ((wq1) zm9Var.b).scrollBy(0, i10);
                    break;
                } catch (Throwable th5) {
                    cc4.g(th5, true);
                    return;
                }
            case 27:
                wb2 wb2Var = ((kb2) obj).a;
                int i30 = wb2Var.N5;
                if (i10 == i30) {
                    wo0 wo0Var = (wo0) wb2Var.I5.get(i30);
                    if (wo0Var != null) {
                        hf0 hf0Var = wo0Var.s;
                        if (hf0Var != null) {
                            hf0Var.setState(StateSet.NOTHING);
                        }
                        wo0Var.b(false);
                        if (!wb2Var.Q5.r1) {
                            if (wo0Var.j != null) {
                                wb2Var.o();
                            } else if (wo0Var.i != null) {
                                wb2Var.o();
                                rb2 rb2Var = wb2Var.eb;
                                if (rb2Var != null) {
                                    rb2Var.l0(wb2Var, wo0Var.i);
                                }
                            }
                        }
                    }
                    wb2Var.N5 = -1;
                    wb2Var.r2();
                    break;
                }
                break;
            case 28:
                ConnectionsManager.lambda$onUpdateConfig$21(i10, (TLRPC.TL_config) obj);
                break;
            default:
                nx0 nx0Var = (nx0) obj;
                e S = LaunchActivity.S();
                if (S != null) {
                    nx0Var.dismiss();
                    PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "create_bot");
                    premiumPreviewFragment.setCurrentAccount(i10);
                    S.presentFragment(premiumPreviewFragment);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ zd(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }
}
