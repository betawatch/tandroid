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

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class vu extends org.telegram.ui.Components.zl0 {
    public static final /* synthetic */ int w3 = 0;
    public boolean e3;
    public int f3;
    public final s4.c0 g3;
    public final tu h3;
    public final ArrayList i3;
    public final ArrayList j3;
    public final float[] k3;
    public final int[] l3;
    public final ArrayList m3;
    public uu[] n3;
    public uu[] o3;
    public final boolean[] p3;
    public long q3;
    public long r3;
    public long s3;
    public boolean t3;
    public su u3;
    public final /* synthetic */ zu v3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vu(zu zuVar, Activity activity) {
        super(activity, null);
        li.p pVar;
        this.v3 = zuVar;
        this.e3 = false;
        this.f3 = 0;
        this.i3 = new ArrayList();
        this.j3 = new ArrayList();
        this.k3 = new float[7];
        this.l3 = new int[7];
        this.m3 = new ArrayList();
        this.p3 = new boolean[7];
        pVar = ((org.telegram.ui.ActionBar.n2) zuVar).glassEngine;
        pVar.b(this);
        setClipToPadding(false);
        setCaptureSectionsDecoratorAllowed(true);
        s4.c0 c0Var = new s4.c0();
        this.g3 = c0Var;
        setLayoutManager(c0Var);
        tu tuVar = new tu(this, 0);
        this.h3 = tuVar;
        setAdapter(tuVar);
        r1();
        setOnItemClickListener(new i(this, 7));
        s4.j jVar = new s4.j();
        jVar.n(220L);
        jVar.o(org.telegram.ui.Components.tr.h);
        jVar.C = false;
        jVar.m = false;
        setItemAnimator(jVar);
        li.a.c(this, zuVar.h, zuVar.n, AndroidUtilities.dp(42.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 0);
    }

    public final void A1() {
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
        this.q3 = x1(6) + z1(6);
        this.r3 = x1(6);
        this.s3 = z1(6);
        if (this.n3 == null) {
            this.n3 = new uu[7];
        }
        if (this.o3 == null) {
            this.o3 = new uu[7];
        }
        int i19 = 0;
        while (true) {
            int[] iArr = zu.x;
            int length = iArr.length;
            float[] fArr = this.k3;
            if (i19 >= length) {
                Arrays.sort(this.n3, new ff(20));
                AndroidUtilities.roundPercents(fArr, this.l3);
                Arrays.fill(this.p3, true);
                return;
            }
            int i20 = iArr[i19];
            long x12 = x1(i20) + z1(i20);
            uu[] uuVarArr = this.o3;
            uu[] uuVarArr2 = this.n3;
            long x13 = x1(iArr[i19]);
            long z12 = z1(iArr[i19]);
            int i21 = iArr[i19];
            int i22 = this.f3;
            zu zuVar = this.v3;
            if (i22 == 1 || i22 == 2 || i22 == 3) {
                i10 = ((org.telegram.ui.ActionBar.n2) zuVar).currentAccount;
                i11 = 1;
                recivedItemsCount = StatsController.getInstance(i10).getRecivedItemsCount(this.f3 - 1, i21);
            } else {
                i16 = ((org.telegram.ui.ActionBar.n2) zuVar).currentAccount;
                int recivedItemsCount2 = StatsController.getInstance(i16).getRecivedItemsCount(0, i21);
                i17 = ((org.telegram.ui.ActionBar.n2) zuVar).currentAccount;
                int recivedItemsCount3 = StatsController.getInstance(i17).getRecivedItemsCount(1, i21) + recivedItemsCount2;
                i18 = ((org.telegram.ui.ActionBar.n2) zuVar).currentAccount;
                recivedItemsCount = StatsController.getInstance(i18).getRecivedItemsCount(2, i21) + recivedItemsCount3;
                i11 = 1;
            }
            int i23 = iArr[i19];
            int i24 = this.f3;
            if (i24 == i11 || i24 == 2 || i24 == 3) {
                i12 = ((org.telegram.ui.ActionBar.n2) zuVar).currentAccount;
                z10 = true;
                sentItemsCount = StatsController.getInstance(i12).getSentItemsCount(this.f3 - 1, i23);
            } else {
                i13 = ((org.telegram.ui.ActionBar.n2) zuVar).currentAccount;
                int sentItemsCount2 = StatsController.getInstance(i13).getSentItemsCount(0, i23);
                i14 = ((org.telegram.ui.ActionBar.n2) zuVar).currentAccount;
                int sentItemsCount3 = StatsController.getInstance(i14).getSentItemsCount(1, i23) + sentItemsCount2;
                i15 = ((org.telegram.ui.ActionBar.n2) zuVar).currentAccount;
                sentItemsCount = StatsController.getInstance(i15).getSentItemsCount(2, i23) + sentItemsCount3;
                z10 = true;
            }
            uu uuVar = new uu();
            uuVar.d = i19;
            uuVar.c = x12;
            uuVar.b = z10;
            uuVar.e = x13;
            uuVar.g = recivedItemsCount;
            uuVar.f = z12;
            uuVar.h = sentItemsCount;
            uuVarArr2[i19] = uuVar;
            uuVarArr[i19] = uuVar;
            fArr[i19] = x12 / this.q3;
            i19++;
        }
    }

    public final void B1(boolean z10) {
        int i10;
        int i11;
        String string;
        SpannableString spannableString;
        SpannableString spannableString2;
        String format;
        ArrayList arrayList = this.i3;
        arrayList.clear();
        ArrayList arrayList2 = this.j3;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i12 = 0;
        arrayList2.add(new qu(0, false));
        int i13 = 1;
        long j3 = 0;
        String formatString = this.q3 > 0 ? LocaleController.formatString(R.string.YourNetworkUsageSince, LocaleController.getInstance().getFormatterStats().format(y1())) : LocaleController.formatString(R.string.NoNetworkUsageSince, LocaleController.getInstance().getFormatterStats().format(y1()));
        arrayList2.add(new qu(1, formatString));
        ArrayList arrayList3 = new ArrayList();
        int i14 = 0;
        while (true) {
            uu[] uuVarArr = this.n3;
            if (i14 >= uuVarArr.length) {
                break;
            }
            uu uuVar = uuVarArr[i14];
            long j10 = j3;
            long j11 = uuVar.c;
            int i15 = uuVar.d;
            boolean z11 = this.t3 || this.m3.contains(Integer.valueOf(i15));
            if (j11 > j10 || z11) {
                int i16 = this.l3[i15];
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
                spannableString3.setSpan(new org.telegram.ui.Components.e61(AndroidUtilities.bold()), i12, spannableString3.length(), 33);
                spannableString3.setSpan(new RelativeSizeSpan(0.8f), i12, spannableString3.length(), 33);
                pu puVar = new pu();
                puVar.a = 0.1d;
                spannableString3.setSpan(puVar, 0, spannableString3.length(), 33);
                int i17 = zu.v[i15];
                int[] iArr = zu.r[i15];
                arrayList3.add(new qu(i14, i17, iArr[0], iArr[1], j11 == j10 ? LocaleController.getString(zu.w[i15]) : TextUtils.concat(LocaleController.getString(zu.w[i15]), "  ", spannableString3), AndroidUtilities.formatFileSize(j11)));
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
            int i18 = org.telegram.ui.ActionBar.i6.G6;
            org.telegram.ui.ActionBar.d6 d6Var = this.p2;
            int v02 = org.telegram.ui.ActionBar.i6.v0(i18, d6Var);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            mutate.setColorFilter(new PorterDuffColorFilter(v02, mode));
            mutate.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
            spannableString4.setSpan(new ImageSpan(mutate, 2), 0, 1, 33);
            SpannableString spannableString5 = new SpannableString("v");
            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_mini_download).mutate();
            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i18, d6Var), mode));
            mutate2.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
            spannableString5.setSpan(new ImageSpan(mutate2, 2), 0, 1, 33);
            int i19 = 0;
            while (i19 < arrayList3.size()) {
                int i20 = ((qu) arrayList3.get(i19)).h;
                if (i20 < 0 || this.p3[i20]) {
                    spannableString = spannableString4;
                    spannableString2 = spannableString5;
                } else {
                    uu uuVar2 = this.n3[i20];
                    int[] iArr2 = zu.x;
                    int i21 = uuVar2.d;
                    int i22 = uuVar2.g;
                    int i23 = uuVar2.h;
                    long j13 = uuVar2.e;
                    spannableString = spannableString4;
                    spannableString2 = spannableString5;
                    long j14 = uuVar2.f;
                    int i24 = iArr2[i21];
                    if (i24 == 0) {
                        if (j14 > j12 || i23 > 0) {
                            i19++;
                            arrayList3.add(i19, qu.b(LocaleController.formatPluralStringComma("OutgoingCallsCount", i23), AndroidUtilities.formatFileSize(j14)));
                        }
                        if (j13 > j12 || i22 > 0) {
                            i19++;
                            arrayList3.add(i19, qu.b(LocaleController.formatPluralStringComma("IncomingCallsCount", i22), AndroidUtilities.formatFileSize(j13)));
                        }
                    } else if (i24 != 1) {
                        if (j14 > j12 || i23 > 0) {
                            i19++;
                            arrayList3.add(i19, qu.b(TextUtils.concat(spannableString, " ", AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("FilesSentCount", i23))), AndroidUtilities.formatFileSize(j14)));
                        }
                        if (j13 > j12 || i22 > 0) {
                            i19++;
                            arrayList3.add(i19, qu.b(TextUtils.concat(spannableString2, " ", AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("FilesReceivedCount", i22))), AndroidUtilities.formatFileSize(j13)));
                        }
                    } else {
                        if (j14 > j12 || i23 > 0) {
                            i19++;
                            arrayList3.add(i19, qu.b(TextUtils.concat(spannableString, " ", LocaleController.getString(R.string.BytesSent)), AndroidUtilities.formatFileSize(j14)));
                        }
                        if (j13 > j12 || i22 > 0) {
                            i19++;
                            arrayList3.add(i19, qu.b(TextUtils.concat(spannableString2, " ", LocaleController.getString(R.string.BytesReceived)), AndroidUtilities.formatFileSize(j13)));
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
            if (!this.t3) {
                arrayList2.add(new qu(3, LocaleController.getString(R.string.DataUsageSectionsInfo) + "\n"));
            }
        }
        if (!this.t3) {
            arrayList2.add(new qu(4, LocaleController.getString(R.string.TotalNetworkUsage)));
            arrayList2.add(new qu(-1, R.drawable.msg_filled_data_sent, -11565578, -13276952, LocaleController.getString(R.string.BytesSent), AndroidUtilities.formatFileSize(this.s3)));
            arrayList2.add(new qu(-1, R.drawable.msg_filled_data_received, -11154873, -14175180, LocaleController.getString(R.string.BytesReceived), AndroidUtilities.formatFileSize(this.r3)));
        }
        if (arrayList3.isEmpty()) {
            i10 = 3;
        } else {
            i10 = 3;
            arrayList2.add(new qu(3, formatString));
        }
        if (this.f3 != 0) {
            if (arrayList3.isEmpty()) {
                arrayList2.add(new qu(i10, false));
            }
            arrayList2.add(new qu(-2, R.drawable.msg_download_settings, -11565578, -13276952, LocaleController.getString(R.string.AutomaticDownloadSettings), null));
            int i25 = this.f3;
            if (i25 != 1) {
                i11 = 3;
                string = i25 != 3 ? LocaleController.getString(R.string.AutomaticDownloadSettingsInfoWiFi) : LocaleController.getString(R.string.AutomaticDownloadSettingsInfoRoaming);
            } else {
                i11 = 3;
                string = LocaleController.getString(R.string.AutomaticDownloadSettingsInfoMobile);
            }
            arrayList2.add(new qu(i11, string));
        }
        if (!arrayList3.isEmpty()) {
            arrayList2.add(new qu(5, LocaleController.getString(R.string.ResetStatistics)));
        }
        arrayList2.add(new qu(3, false));
        tu tuVar = this.h3;
        if (tuVar != null) {
            if (z10) {
                tuVar.E(arrayList, arrayList2);
            } else {
                tuVar.l();
            }
        }
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
    }

    public final long x1(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.f3;
        zu zuVar = this.v3;
        if (i15 == 1 || i15 == 2 || i15 == 3) {
            i11 = ((org.telegram.ui.ActionBar.n2) zuVar).currentAccount;
            return StatsController.getInstance(i11).getReceivedBytesCount(this.f3 - 1, i10);
        }
        i12 = ((org.telegram.ui.ActionBar.n2) zuVar).currentAccount;
        long receivedBytesCount = StatsController.getInstance(i12).getReceivedBytesCount(0, i10);
        i13 = ((org.telegram.ui.ActionBar.n2) zuVar).currentAccount;
        long receivedBytesCount2 = StatsController.getInstance(i13).getReceivedBytesCount(1, i10) + receivedBytesCount;
        i14 = ((org.telegram.ui.ActionBar.n2) zuVar).currentAccount;
        return StatsController.getInstance(i14).getReceivedBytesCount(2, i10) + receivedBytesCount2;
    }

    public final long y1() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.f3;
        zu zuVar = this.v3;
        if (i14 == 1 || i14 == 2 || i14 == 3) {
            i10 = ((org.telegram.ui.ActionBar.n2) zuVar).currentAccount;
            return StatsController.getInstance(i10).getResetStatsDate(this.f3 - 1);
        }
        i11 = ((org.telegram.ui.ActionBar.n2) zuVar).currentAccount;
        long resetStatsDate = StatsController.getInstance(i11).getResetStatsDate(0);
        i12 = ((org.telegram.ui.ActionBar.n2) zuVar).currentAccount;
        long resetStatsDate2 = StatsController.getInstance(i12).getResetStatsDate(1);
        i13 = ((org.telegram.ui.ActionBar.n2) zuVar).currentAccount;
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

    public final long z1(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.f3;
        zu zuVar = this.v3;
        if (i15 == 1 || i15 == 2 || i15 == 3) {
            i11 = ((org.telegram.ui.ActionBar.n2) zuVar).currentAccount;
            return StatsController.getInstance(i11).getSentBytesCount(this.f3 - 1, i10);
        }
        i12 = ((org.telegram.ui.ActionBar.n2) zuVar).currentAccount;
        long sentBytesCount = StatsController.getInstance(i12).getSentBytesCount(0, i10);
        i13 = ((org.telegram.ui.ActionBar.n2) zuVar).currentAccount;
        long sentBytesCount2 = StatsController.getInstance(i13).getSentBytesCount(1, i10) + sentBytesCount;
        i14 = ((org.telegram.ui.ActionBar.n2) zuVar).currentAccount;
        return StatsController.getInstance(i14).getSentBytesCount(2, i10) + sentBytesCount2;
    }
}
