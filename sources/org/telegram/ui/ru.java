package org.telegram.ui;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.StatsController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class ru extends org.telegram.ui.Components.wl0 {
    public static final /* synthetic */ int p3 = 0;
    public boolean X2;
    public int Y2;
    public final s4.c0 Z2;
    public final pu a3;
    public final ArrayList b3;
    public final ArrayList c3;
    public final float[] d3;
    public final int[] e3;
    public final ArrayList f3;
    public qu[] g3;
    public qu[] h3;
    public final boolean[] i3;
    public long j3;
    public long k3;
    public long l3;
    public boolean m3;
    public ou n3;
    public final /* synthetic */ vu o3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru(vu vuVar, Activity activity) {
        super(activity, null);
        this.o3 = vuVar;
        this.X2 = false;
        this.Y2 = 0;
        this.b3 = new ArrayList();
        this.c3 = new ArrayList();
        this.d3 = new float[7];
        this.e3 = new int[7];
        this.f3 = new ArrayList();
        this.i3 = new boolean[7];
        s4.c0 c0Var = new s4.c0();
        this.Z2 = c0Var;
        setLayoutManager(c0Var);
        pu puVar = new pu(this, 0);
        this.a3 = puVar;
        setAdapter(puVar);
        p1();
        setOnItemClickListener(new i(this, 7));
        s4.j jVar = new s4.j();
        jVar.n(220L);
        jVar.o(org.telegram.ui.Components.rr.h);
        jVar.C = false;
        jVar.m = false;
        setItemAnimator(jVar);
    }

    public final void A1(boolean z10) {
        int i10;
        int i11;
        String string;
        SpannableString spannableString;
        SpannableString spannableString2;
        String format;
        ArrayList arrayList = this.b3;
        arrayList.clear();
        ArrayList arrayList2 = this.c3;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i12 = 0;
        arrayList2.add(new mu(0, false));
        int i13 = 1;
        long j3 = 0;
        String formatString = this.j3 > 0 ? LocaleController.formatString(R.string.YourNetworkUsageSince, LocaleController.getInstance().getFormatterStats().format(x1())) : LocaleController.formatString(R.string.NoNetworkUsageSince, LocaleController.getInstance().getFormatterStats().format(x1()));
        arrayList2.add(new mu(1, formatString));
        ArrayList arrayList3 = new ArrayList();
        int i14 = 0;
        while (true) {
            qu[] quVarArr = this.g3;
            if (i14 >= quVarArr.length) {
                break;
            }
            qu quVar = quVarArr[i14];
            long j10 = j3;
            long j11 = quVar.c;
            int i15 = quVar.d;
            boolean z11 = this.m3 || this.f3.contains(Integer.valueOf(i15));
            if (j11 > j10 || z11) {
                int i16 = this.e3[i15];
                if (i16 <= 0) {
                    Object[] objArr = new Object[i13];
                    objArr[i12] = Integer.valueOf(i13);
                    format = String.format("<%d%%", objArr);
                } else {
                    Integer valueOf = Integer.valueOf(i16);
                    Object[] objArr2 = new Object[i13];
                    objArr2[i12] = valueOf;
                    format = String.format("%d%%", objArr2);
                }
                SpannableString spannableString3 = new SpannableString(format);
                spannableString3.setSpan(new org.telegram.ui.Components.s51(AndroidUtilities.bold()), i12, spannableString3.length(), 33);
                spannableString3.setSpan(new RelativeSizeSpan(0.8f), i12, spannableString3.length(), 33);
                lu luVar = new lu();
                luVar.a = 0.1d;
                spannableString3.setSpan(luVar, 0, spannableString3.length(), 33);
                int i17 = vu.f[i15];
                int[] iArr = vu.d[i15];
                arrayList3.add(new mu(i14, i17, iArr[0], iArr[1], j11 == j10 ? LocaleController.getString(vu.h[i15]) : TextUtils.concat(LocaleController.getString(vu.h[i15]), "  ", spannableString3), AndroidUtilities.formatFileSize(j11)));
            }
            i14++;
            j3 = j10;
            i13 = 1;
            i12 = 0;
        }
        long j12 = j3;
        if (!arrayList3.isEmpty()) {
            SpannableString spannableString4 = new SpannableString("^");
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_upload).mutate();
            int i18 = org.telegram.ui.ActionBar.h6.G6;
            org.telegram.ui.ActionBar.d6 d6Var = this.p2;
            int v02 = org.telegram.ui.ActionBar.h6.v0(i18, d6Var);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            mutate.setColorFilter(new PorterDuffColorFilter(v02, mode));
            mutate.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
            spannableString4.setSpan(new ImageSpan(mutate, 2), 0, 1, 33);
            SpannableString spannableString5 = new SpannableString("v");
            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_mini_download).mutate();
            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(i18, d6Var), mode));
            mutate2.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
            spannableString5.setSpan(new ImageSpan(mutate2, 2), 0, 1, 33);
            int i19 = 0;
            while (i19 < arrayList3.size()) {
                int i20 = ((mu) arrayList3.get(i19)).h;
                if (i20 < 0 || this.i3[i20]) {
                    spannableString = spannableString4;
                    spannableString2 = spannableString5;
                } else {
                    qu quVar2 = this.g3[i20];
                    int[] iArr2 = vu.n;
                    int i21 = quVar2.d;
                    int i22 = quVar2.g;
                    int i23 = quVar2.h;
                    long j13 = quVar2.e;
                    spannableString = spannableString4;
                    spannableString2 = spannableString5;
                    long j14 = quVar2.f;
                    int i24 = iArr2[i21];
                    if (i24 == 0) {
                        if (j14 > j12 || i23 > 0) {
                            i19++;
                            arrayList3.add(i19, mu.b(LocaleController.formatPluralStringComma("OutgoingCallsCount", i23), AndroidUtilities.formatFileSize(j14)));
                        }
                        if (j13 > j12 || i22 > 0) {
                            i19++;
                            arrayList3.add(i19, mu.b(LocaleController.formatPluralStringComma("IncomingCallsCount", i22), AndroidUtilities.formatFileSize(j13)));
                        }
                    } else if (i24 != 1) {
                        if (j14 > j12 || i23 > 0) {
                            i19++;
                            arrayList3.add(i19, mu.b(TextUtils.concat(spannableString, " ", AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("FilesSentCount", i23))), AndroidUtilities.formatFileSize(j14)));
                        }
                        if (j13 > j12 || i22 > 0) {
                            i19++;
                            arrayList3.add(i19, mu.b(TextUtils.concat(spannableString2, " ", AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("FilesReceivedCount", i22))), AndroidUtilities.formatFileSize(j13)));
                        }
                    } else {
                        if (j14 > j12 || i23 > 0) {
                            i19++;
                            arrayList3.add(i19, mu.b(TextUtils.concat(spannableString, " ", LocaleController.getString(R.string.BytesSent)), AndroidUtilities.formatFileSize(j14)));
                        }
                        if (j13 > j12 || i22 > 0) {
                            i19++;
                            arrayList3.add(i19, mu.b(TextUtils.concat(spannableString2, " ", LocaleController.getString(R.string.BytesReceived)), AndroidUtilities.formatFileSize(j13)));
                            i19++;
                            spannableString4 = spannableString;
                            spannableString5 = spannableString2;
                        }
                    }
                }
                i19++;
                spannableString4 = spannableString;
                spannableString5 = spannableString2;
            }
            arrayList2.addAll(arrayList3);
            if (!this.m3) {
                arrayList2.add(new mu(3, LocaleController.getString(R.string.DataUsageSectionsInfo) + "\n"));
            }
        }
        if (!this.m3) {
            arrayList2.add(new mu(4, LocaleController.getString(R.string.TotalNetworkUsage)));
            arrayList2.add(new mu(-1, R.drawable.msg_filled_data_sent, -11565578, -13276952, LocaleController.getString(R.string.BytesSent), AndroidUtilities.formatFileSize(this.l3)));
            arrayList2.add(new mu(-1, R.drawable.msg_filled_data_received, -11154873, -14175180, LocaleController.getString(R.string.BytesReceived), AndroidUtilities.formatFileSize(this.k3)));
        }
        if (arrayList3.isEmpty()) {
            i10 = 3;
        } else {
            i10 = 3;
            arrayList2.add(new mu(3, formatString));
        }
        if (this.Y2 != 0) {
            if (arrayList3.isEmpty()) {
                arrayList2.add(new mu(i10, false));
            }
            arrayList2.add(new mu(-2, R.drawable.msg_download_settings, -11565578, -13276952, LocaleController.getString(R.string.AutomaticDownloadSettings), null));
            int i25 = this.Y2;
            if (i25 != 1) {
                i11 = 3;
                string = i25 != 3 ? LocaleController.getString(R.string.AutomaticDownloadSettingsInfoWiFi) : LocaleController.getString(R.string.AutomaticDownloadSettingsInfoRoaming);
            } else {
                i11 = 3;
                string = LocaleController.getString(R.string.AutomaticDownloadSettingsInfoMobile);
            }
            arrayList2.add(new mu(i11, string));
        }
        if (!arrayList3.isEmpty()) {
            arrayList2.add(new mu(5, LocaleController.getString(R.string.ResetStatistics)));
        }
        arrayList2.add(new mu(3, false));
        pu puVar = this.a3;
        if (puVar != null) {
            if (z10) {
                puVar.E(arrayList, arrayList2);
            } else {
                puVar.l();
            }
        }
    }

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
    }

    public final long w1(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.Y2;
        vu vuVar = this.o3;
        if (i15 == 1 || i15 == 2 || i15 == 3) {
            i11 = ((org.telegram.ui.ActionBar.m2) vuVar).currentAccount;
            return StatsController.getInstance(i11).getReceivedBytesCount(this.Y2 - 1, i10);
        }
        i12 = ((org.telegram.ui.ActionBar.m2) vuVar).currentAccount;
        long receivedBytesCount = StatsController.getInstance(i12).getReceivedBytesCount(0, i10);
        i13 = ((org.telegram.ui.ActionBar.m2) vuVar).currentAccount;
        long receivedBytesCount2 = StatsController.getInstance(i13).getReceivedBytesCount(1, i10) + receivedBytesCount;
        i14 = ((org.telegram.ui.ActionBar.m2) vuVar).currentAccount;
        return StatsController.getInstance(i14).getReceivedBytesCount(2, i10) + receivedBytesCount2;
    }

    public final long x1() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.Y2;
        vu vuVar = this.o3;
        if (i14 == 1 || i14 == 2 || i14 == 3) {
            i10 = ((org.telegram.ui.ActionBar.m2) vuVar).currentAccount;
            return StatsController.getInstance(i10).getResetStatsDate(this.Y2 - 1);
        }
        i11 = ((org.telegram.ui.ActionBar.m2) vuVar).currentAccount;
        long resetStatsDate = StatsController.getInstance(i11).getResetStatsDate(0);
        i12 = ((org.telegram.ui.ActionBar.m2) vuVar).currentAccount;
        long resetStatsDate2 = StatsController.getInstance(i12).getResetStatsDate(1);
        i13 = ((org.telegram.ui.ActionBar.m2) vuVar).currentAccount;
        long[] jArr = {resetStatsDate, resetStatsDate2, StatsController.getInstance(i13).getResetStatsDate(2)};
        long j3 = Long.MAX_VALUE;
        for (int i15 = 0; i15 < 3; i15++) {
            long j10 = jArr[i15];
            if (j3 > j10) {
                j3 = j10;
            }
        }
        return j3;
    }

    public final long y1(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.Y2;
        vu vuVar = this.o3;
        if (i15 == 1 || i15 == 2 || i15 == 3) {
            i11 = ((org.telegram.ui.ActionBar.m2) vuVar).currentAccount;
            return StatsController.getInstance(i11).getSentBytesCount(this.Y2 - 1, i10);
        }
        i12 = ((org.telegram.ui.ActionBar.m2) vuVar).currentAccount;
        long sentBytesCount = StatsController.getInstance(i12).getSentBytesCount(0, i10);
        i13 = ((org.telegram.ui.ActionBar.m2) vuVar).currentAccount;
        long sentBytesCount2 = StatsController.getInstance(i13).getSentBytesCount(1, i10) + sentBytesCount;
        i14 = ((org.telegram.ui.ActionBar.m2) vuVar).currentAccount;
        return StatsController.getInstance(i14).getSentBytesCount(2, i10) + sentBytesCount2;
    }

    public final void z1() {
        int i10;
        int i11;
        int recivedItemsCount;
        int i12;
        boolean z10;
        int sentItemsCount;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        this.j3 = w1(6) + y1(6);
        this.k3 = w1(6);
        this.l3 = y1(6);
        if (this.g3 == null) {
            this.g3 = new qu[7];
        }
        if (this.h3 == null) {
            this.h3 = new qu[7];
        }
        int i19 = 0;
        while (true) {
            int[] iArr = vu.n;
            int length = iArr.length;
            float[] fArr = this.d3;
            if (i19 >= length) {
                Arrays.sort(this.g3, new cf(20));
                AndroidUtilities.roundPercents(fArr, this.e3);
                Arrays.fill(this.i3, true);
                return;
            }
            int i20 = iArr[i19];
            long w12 = w1(i20) + y1(i20);
            qu[] quVarArr = this.h3;
            qu[] quVarArr2 = this.g3;
            long w13 = w1(iArr[i19]);
            long y12 = y1(iArr[i19]);
            int i21 = iArr[i19];
            int i22 = this.Y2;
            vu vuVar = this.o3;
            if (i22 == 1 || i22 == 2 || i22 == 3) {
                i10 = ((org.telegram.ui.ActionBar.m2) vuVar).currentAccount;
                i11 = 1;
                recivedItemsCount = StatsController.getInstance(i10).getRecivedItemsCount(this.Y2 - 1, i21);
            } else {
                i16 = ((org.telegram.ui.ActionBar.m2) vuVar).currentAccount;
                int recivedItemsCount2 = StatsController.getInstance(i16).getRecivedItemsCount(0, i21);
                i17 = ((org.telegram.ui.ActionBar.m2) vuVar).currentAccount;
                int recivedItemsCount3 = StatsController.getInstance(i17).getRecivedItemsCount(1, i21) + recivedItemsCount2;
                i18 = ((org.telegram.ui.ActionBar.m2) vuVar).currentAccount;
                recivedItemsCount = StatsController.getInstance(i18).getRecivedItemsCount(2, i21) + recivedItemsCount3;
                i11 = 1;
            }
            int i23 = iArr[i19];
            int i24 = this.Y2;
            if (i24 == i11 || i24 == 2 || i24 == 3) {
                i12 = ((org.telegram.ui.ActionBar.m2) vuVar).currentAccount;
                z10 = true;
                sentItemsCount = StatsController.getInstance(i12).getSentItemsCount(this.Y2 - 1, i23);
            } else {
                i13 = ((org.telegram.ui.ActionBar.m2) vuVar).currentAccount;
                int sentItemsCount2 = StatsController.getInstance(i13).getSentItemsCount(0, i23);
                i14 = ((org.telegram.ui.ActionBar.m2) vuVar).currentAccount;
                int sentItemsCount3 = StatsController.getInstance(i14).getSentItemsCount(1, i23) + sentItemsCount2;
                i15 = ((org.telegram.ui.ActionBar.m2) vuVar).currentAccount;
                sentItemsCount = StatsController.getInstance(i15).getSentItemsCount(2, i23) + sentItemsCount3;
                z10 = true;
            }
            qu quVar = new qu();
            quVar.d = i19;
            quVar.c = w12;
            quVar.b = z10;
            quVar.e = w13;
            quVar.g = recivedItemsCount;
            quVar.f = y12;
            quVar.h = sentItemsCount;
            quVarArr2[i19] = quVar;
            quVarArr[i19] = quVar;
            fArr[i19] = w12 / this.j3;
            i19++;
        }
    }
}
