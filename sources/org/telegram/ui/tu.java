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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class tu extends org.telegram.ui.Components.sl0 {
    public static final /* synthetic */ int m3 = 0;
    public boolean U2;
    public int V2;
    public final f2.i0 W2;
    public final ru X2;
    public final ArrayList Y2;
    public final ArrayList Z2;
    public final float[] a3;
    public final int[] b3;
    public final ArrayList c3;
    public su[] d3;
    public su[] e3;
    public final boolean[] f3;
    public long g3;
    public long h3;
    public long i3;
    public boolean j3;
    public qu k3;
    public final /* synthetic */ xu l3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu(xu xuVar, Activity activity) {
        super(activity, null);
        this.l3 = xuVar;
        this.U2 = false;
        this.V2 = 0;
        this.Y2 = new ArrayList();
        this.Z2 = new ArrayList();
        this.a3 = new float[7];
        this.b3 = new int[7];
        this.c3 = new ArrayList();
        this.f3 = new boolean[7];
        f2.i0 i0Var = new f2.i0();
        this.W2 = i0Var;
        setLayoutManager(i0Var);
        ru ruVar = new ru(this, 0);
        this.X2 = ruVar;
        setAdapter(ruVar);
        p1();
        setOnItemClickListener(new j(this, 7));
        f2.l lVar = new f2.l();
        lVar.n(220L);
        lVar.o(org.telegram.ui.Components.nr.h);
        lVar.C = false;
        lVar.m = false;
        setItemAnimator(lVar);
    }

    public final void A1(boolean z4) {
        int i10;
        int i11;
        String string;
        SpannableString spannableString;
        SpannableString spannableString2;
        String format;
        ArrayList arrayList = this.Y2;
        arrayList.clear();
        ArrayList arrayList2 = this.Z2;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i12 = 0;
        arrayList2.add(new ou(0, false));
        int i13 = 1;
        long j10 = 0;
        String formatString = this.g3 > 0 ? LocaleController.formatString(R.string.YourNetworkUsageSince, LocaleController.getInstance().getFormatterStats().format(x1())) : LocaleController.formatString(R.string.NoNetworkUsageSince, LocaleController.getInstance().getFormatterStats().format(x1()));
        arrayList2.add(new ou(1, formatString));
        ArrayList arrayList3 = new ArrayList();
        int i14 = 0;
        while (true) {
            su[] suVarArr = this.d3;
            if (i14 >= suVarArr.length) {
                break;
            }
            su suVar = suVarArr[i14];
            long j11 = j10;
            long j12 = suVar.c;
            int i15 = suVar.d;
            boolean z10 = this.j3 || this.c3.contains(Integer.valueOf(i15));
            if (j12 > j11 || z10) {
                int i16 = this.b3[i15];
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
                spannableString3.setSpan(new org.telegram.ui.Components.f51(AndroidUtilities.bold()), i12, spannableString3.length(), 33);
                spannableString3.setSpan(new RelativeSizeSpan(0.8f), i12, spannableString3.length(), 33);
                nu nuVar = new nu();
                nuVar.a = 0.1d;
                spannableString3.setSpan(nuVar, 0, spannableString3.length(), 33);
                int i17 = xu.f[i15];
                int[] iArr = xu.d[i15];
                arrayList3.add(new ou(i14, i17, iArr[0], iArr[1], j12 == j11 ? LocaleController.getString(xu.h[i15]) : TextUtils.concat(LocaleController.getString(xu.h[i15]), "  ", spannableString3), AndroidUtilities.formatFileSize(j12)));
            }
            i14++;
            j10 = j11;
            i13 = 1;
            i12 = 0;
        }
        long j13 = j10;
        if (!arrayList3.isEmpty()) {
            SpannableString spannableString4 = new SpannableString("^");
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_upload).mutate();
            int i18 = org.telegram.ui.ActionBar.j6.G6;
            org.telegram.ui.ActionBar.f6 f6Var = this.m2;
            int v02 = org.telegram.ui.ActionBar.j6.v0(i18, f6Var);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            mutate.setColorFilter(new PorterDuffColorFilter(v02, mode));
            mutate.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
            spannableString4.setSpan(new ImageSpan(mutate, 2), 0, 1, 33);
            SpannableString spannableString5 = new SpannableString("v");
            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_mini_download).mutate();
            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i18, f6Var), mode));
            mutate2.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
            spannableString5.setSpan(new ImageSpan(mutate2, 2), 0, 1, 33);
            int i19 = 0;
            while (i19 < arrayList3.size()) {
                int i20 = ((ou) arrayList3.get(i19)).h;
                if (i20 < 0 || this.f3[i20]) {
                    spannableString = spannableString4;
                    spannableString2 = spannableString5;
                } else {
                    su suVar2 = this.d3[i20];
                    int[] iArr2 = xu.n;
                    int i21 = suVar2.d;
                    int i22 = suVar2.g;
                    int i23 = suVar2.h;
                    long j14 = suVar2.e;
                    spannableString = spannableString4;
                    spannableString2 = spannableString5;
                    long j15 = suVar2.f;
                    int i24 = iArr2[i21];
                    if (i24 == 0) {
                        if (j15 > j13 || i23 > 0) {
                            i19++;
                            arrayList3.add(i19, ou.b(LocaleController.formatPluralStringComma("OutgoingCallsCount", i23), AndroidUtilities.formatFileSize(j15)));
                        }
                        if (j14 > j13 || i22 > 0) {
                            i19++;
                            arrayList3.add(i19, ou.b(LocaleController.formatPluralStringComma("IncomingCallsCount", i22), AndroidUtilities.formatFileSize(j14)));
                        }
                    } else if (i24 != 1) {
                        if (j15 > j13 || i23 > 0) {
                            i19++;
                            arrayList3.add(i19, ou.b(TextUtils.concat(spannableString, " ", AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("FilesSentCount", i23))), AndroidUtilities.formatFileSize(j15)));
                        }
                        if (j14 > j13 || i22 > 0) {
                            i19++;
                            arrayList3.add(i19, ou.b(TextUtils.concat(spannableString2, " ", AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("FilesReceivedCount", i22))), AndroidUtilities.formatFileSize(j14)));
                        }
                    } else {
                        if (j15 > j13 || i23 > 0) {
                            i19++;
                            arrayList3.add(i19, ou.b(TextUtils.concat(spannableString, " ", LocaleController.getString(R.string.BytesSent)), AndroidUtilities.formatFileSize(j15)));
                        }
                        if (j14 > j13 || i22 > 0) {
                            i19++;
                            arrayList3.add(i19, ou.b(TextUtils.concat(spannableString2, " ", LocaleController.getString(R.string.BytesReceived)), AndroidUtilities.formatFileSize(j14)));
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
            if (!this.j3) {
                arrayList2.add(new ou(3, LocaleController.getString(R.string.DataUsageSectionsInfo) + "\n"));
            }
        }
        if (!this.j3) {
            arrayList2.add(new ou(4, LocaleController.getString(R.string.TotalNetworkUsage)));
            arrayList2.add(new ou(-1, R.drawable.msg_filled_data_sent, -11565578, -13276952, LocaleController.getString(R.string.BytesSent), AndroidUtilities.formatFileSize(this.i3)));
            arrayList2.add(new ou(-1, R.drawable.msg_filled_data_received, -11154873, -14175180, LocaleController.getString(R.string.BytesReceived), AndroidUtilities.formatFileSize(this.h3)));
        }
        if (arrayList3.isEmpty()) {
            i10 = 3;
        } else {
            i10 = 3;
            arrayList2.add(new ou(3, formatString));
        }
        if (this.V2 != 0) {
            if (arrayList3.isEmpty()) {
                arrayList2.add(new ou(i10, false));
            }
            arrayList2.add(new ou(-2, R.drawable.msg_download_settings, -11565578, -13276952, LocaleController.getString(R.string.AutomaticDownloadSettings), null));
            int i25 = this.V2;
            if (i25 != 1) {
                i11 = 3;
                string = i25 != 3 ? LocaleController.getString(R.string.AutomaticDownloadSettingsInfoWiFi) : LocaleController.getString(R.string.AutomaticDownloadSettingsInfoRoaming);
            } else {
                i11 = 3;
                string = LocaleController.getString(R.string.AutomaticDownloadSettingsInfoMobile);
            }
            arrayList2.add(new ou(i11, string));
        }
        if (!arrayList3.isEmpty()) {
            arrayList2.add(new ou(5, LocaleController.getString(R.string.ResetStatistics)));
        }
        arrayList2.add(new ou(3, false));
        ru ruVar = this.X2;
        if (ruVar != null) {
            if (z4) {
                ruVar.E(arrayList, arrayList2);
            } else {
                ruVar.l();
            }
        }
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
    }

    public final long w1(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.V2;
        xu xuVar = this.l3;
        if (i15 == 1 || i15 == 2 || i15 == 3) {
            i11 = ((org.telegram.ui.ActionBar.p2) xuVar).currentAccount;
            return StatsController.getInstance(i11).getReceivedBytesCount(this.V2 - 1, i10);
        }
        i12 = ((org.telegram.ui.ActionBar.p2) xuVar).currentAccount;
        long receivedBytesCount = StatsController.getInstance(i12).getReceivedBytesCount(0, i10);
        i13 = ((org.telegram.ui.ActionBar.p2) xuVar).currentAccount;
        long receivedBytesCount2 = StatsController.getInstance(i13).getReceivedBytesCount(1, i10) + receivedBytesCount;
        i14 = ((org.telegram.ui.ActionBar.p2) xuVar).currentAccount;
        return StatsController.getInstance(i14).getReceivedBytesCount(2, i10) + receivedBytesCount2;
    }

    public final long x1() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.V2;
        xu xuVar = this.l3;
        if (i14 == 1 || i14 == 2 || i14 == 3) {
            i10 = ((org.telegram.ui.ActionBar.p2) xuVar).currentAccount;
            return StatsController.getInstance(i10).getResetStatsDate(this.V2 - 1);
        }
        i11 = ((org.telegram.ui.ActionBar.p2) xuVar).currentAccount;
        long resetStatsDate = StatsController.getInstance(i11).getResetStatsDate(0);
        i12 = ((org.telegram.ui.ActionBar.p2) xuVar).currentAccount;
        long resetStatsDate2 = StatsController.getInstance(i12).getResetStatsDate(1);
        i13 = ((org.telegram.ui.ActionBar.p2) xuVar).currentAccount;
        long[] jArr = {resetStatsDate, resetStatsDate2, StatsController.getInstance(i13).getResetStatsDate(2)};
        long j10 = Long.MAX_VALUE;
        for (int i15 = 0; i15 < 3; i15++) {
            long j11 = jArr[i15];
            if (j10 > j11) {
                j10 = j11;
            }
        }
        return j10;
    }

    public final long y1(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.V2;
        xu xuVar = this.l3;
        if (i15 == 1 || i15 == 2 || i15 == 3) {
            i11 = ((org.telegram.ui.ActionBar.p2) xuVar).currentAccount;
            return StatsController.getInstance(i11).getSentBytesCount(this.V2 - 1, i10);
        }
        i12 = ((org.telegram.ui.ActionBar.p2) xuVar).currentAccount;
        long sentBytesCount = StatsController.getInstance(i12).getSentBytesCount(0, i10);
        i13 = ((org.telegram.ui.ActionBar.p2) xuVar).currentAccount;
        long sentBytesCount2 = StatsController.getInstance(i13).getSentBytesCount(1, i10) + sentBytesCount;
        i14 = ((org.telegram.ui.ActionBar.p2) xuVar).currentAccount;
        return StatsController.getInstance(i14).getSentBytesCount(2, i10) + sentBytesCount2;
    }

    public final void z1() {
        int i10;
        int i11;
        int recivedItemsCount;
        int i12;
        boolean z4;
        int sentItemsCount;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        this.g3 = w1(6) + y1(6);
        this.h3 = w1(6);
        this.i3 = y1(6);
        if (this.d3 == null) {
            this.d3 = new su[7];
        }
        if (this.e3 == null) {
            this.e3 = new su[7];
        }
        int i19 = 0;
        while (true) {
            int[] iArr = xu.n;
            int length = iArr.length;
            float[] fArr = this.a3;
            if (i19 >= length) {
                Arrays.sort(this.d3, new cu(1));
                AndroidUtilities.roundPercents(fArr, this.b3);
                Arrays.fill(this.f3, true);
                return;
            }
            int i20 = iArr[i19];
            long w12 = w1(i20) + y1(i20);
            su[] suVarArr = this.e3;
            su[] suVarArr2 = this.d3;
            long w13 = w1(iArr[i19]);
            long y12 = y1(iArr[i19]);
            int i21 = iArr[i19];
            int i22 = this.V2;
            xu xuVar = this.l3;
            if (i22 == 1 || i22 == 2 || i22 == 3) {
                i10 = ((org.telegram.ui.ActionBar.p2) xuVar).currentAccount;
                i11 = 1;
                recivedItemsCount = StatsController.getInstance(i10).getRecivedItemsCount(this.V2 - 1, i21);
            } else {
                i16 = ((org.telegram.ui.ActionBar.p2) xuVar).currentAccount;
                int recivedItemsCount2 = StatsController.getInstance(i16).getRecivedItemsCount(0, i21);
                i17 = ((org.telegram.ui.ActionBar.p2) xuVar).currentAccount;
                int recivedItemsCount3 = StatsController.getInstance(i17).getRecivedItemsCount(1, i21) + recivedItemsCount2;
                i18 = ((org.telegram.ui.ActionBar.p2) xuVar).currentAccount;
                recivedItemsCount = StatsController.getInstance(i18).getRecivedItemsCount(2, i21) + recivedItemsCount3;
                i11 = 1;
            }
            int i23 = iArr[i19];
            int i24 = this.V2;
            if (i24 == i11 || i24 == 2 || i24 == 3) {
                i12 = ((org.telegram.ui.ActionBar.p2) xuVar).currentAccount;
                z4 = true;
                sentItemsCount = StatsController.getInstance(i12).getSentItemsCount(this.V2 - 1, i23);
            } else {
                i13 = ((org.telegram.ui.ActionBar.p2) xuVar).currentAccount;
                int sentItemsCount2 = StatsController.getInstance(i13).getSentItemsCount(0, i23);
                i14 = ((org.telegram.ui.ActionBar.p2) xuVar).currentAccount;
                int sentItemsCount3 = StatsController.getInstance(i14).getSentItemsCount(1, i23) + sentItemsCount2;
                i15 = ((org.telegram.ui.ActionBar.p2) xuVar).currentAccount;
                sentItemsCount = StatsController.getInstance(i15).getSentItemsCount(2, i23) + sentItemsCount3;
                z4 = true;
            }
            su suVar = new su();
            suVar.d = i19;
            suVar.c = w12;
            suVar.b = z4;
            suVar.e = w13;
            suVar.g = recivedItemsCount;
            suVar.f = y12;
            suVar.h = sentItemsCount;
            suVarArr2[i19] = suVar;
            suVarArr[i19] = suVar;
            fArr[i19] = w12 / this.g3;
            i19++;
        }
    }
}
