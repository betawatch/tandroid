package org.telegram.ui;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class uu extends org.telegram.ui.Components.qm0 {
    public static final /* synthetic */ int n3 = 0;
    public boolean V2;
    public int W2;
    public final s4.d0 X2;
    public final su Y2;
    public final ArrayList Z2;
    public final ArrayList a3;
    public final float[] b3;
    public final int[] c3;
    public final ArrayList d3;
    public tu[] e3;
    public tu[] f3;
    public final boolean[] g3;
    public long h3;
    public long i3;
    public long j3;
    public boolean k3;
    public ru l3;
    public final /* synthetic */ yu m3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu(yu yuVar, Activity activity) {
        super(activity, null);
        this.m3 = yuVar;
        this.V2 = false;
        this.W2 = 0;
        this.Z2 = new ArrayList();
        this.a3 = new ArrayList();
        this.b3 = new float[7];
        this.c3 = new int[7];
        this.d3 = new ArrayList();
        this.g3 = new boolean[7];
        s4.d0 d0Var = new s4.d0();
        this.X2 = d0Var;
        setLayoutManager(d0Var);
        su suVar = new su(this, 0);
        this.Y2 = suVar;
        setAdapter(suVar);
        p1();
        setOnItemClickListener(new i(this, 7));
        s4.j jVar = new s4.j();
        jVar.n(220L);
        jVar.o(org.telegram.ui.Components.hs.h);
        jVar.C = false;
        jVar.m = false;
        setItemAnimator(jVar);
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
        this.h3 = x1(6) + z1(6);
        this.i3 = x1(6);
        this.j3 = z1(6);
        if (this.e3 == null) {
            this.e3 = new tu[7];
        }
        if (this.f3 == null) {
            this.f3 = new tu[7];
        }
        int i19 = 0;
        while (true) {
            int[] iArr = yu.n;
            int length = iArr.length;
            float[] fArr = this.b3;
            if (i19 >= length) {
                Arrays.sort(this.e3, new gf(20));
                AndroidUtilities.roundPercents(fArr, this.c3);
                Arrays.fill(this.g3, true);
                return;
            }
            int i20 = iArr[i19];
            long x12 = x1(i20) + z1(i20);
            tu[] tuVarArr = this.f3;
            tu[] tuVarArr2 = this.e3;
            long x13 = x1(iArr[i19]);
            long z12 = z1(iArr[i19]);
            int i21 = iArr[i19];
            int i22 = this.W2;
            yu yuVar = this.m3;
            if (i22 == 1 || i22 == 2 || i22 == 3) {
                i10 = ((org.telegram.ui.ActionBar.n2) yuVar).currentAccount;
                i11 = 1;
                recivedItemsCount = StatsController.getInstance(i10).getRecivedItemsCount(this.W2 - 1, i21);
            } else {
                i16 = ((org.telegram.ui.ActionBar.n2) yuVar).currentAccount;
                int recivedItemsCount2 = StatsController.getInstance(i16).getRecivedItemsCount(0, i21);
                i17 = ((org.telegram.ui.ActionBar.n2) yuVar).currentAccount;
                int recivedItemsCount3 = StatsController.getInstance(i17).getRecivedItemsCount(1, i21) + recivedItemsCount2;
                i18 = ((org.telegram.ui.ActionBar.n2) yuVar).currentAccount;
                recivedItemsCount = StatsController.getInstance(i18).getRecivedItemsCount(2, i21) + recivedItemsCount3;
                i11 = 1;
            }
            int i23 = iArr[i19];
            int i24 = this.W2;
            if (i24 == i11 || i24 == 2 || i24 == 3) {
                i12 = ((org.telegram.ui.ActionBar.n2) yuVar).currentAccount;
                z10 = true;
                sentItemsCount = StatsController.getInstance(i12).getSentItemsCount(this.W2 - 1, i23);
            } else {
                i13 = ((org.telegram.ui.ActionBar.n2) yuVar).currentAccount;
                int sentItemsCount2 = StatsController.getInstance(i13).getSentItemsCount(0, i23);
                i14 = ((org.telegram.ui.ActionBar.n2) yuVar).currentAccount;
                int sentItemsCount3 = StatsController.getInstance(i14).getSentItemsCount(1, i23) + sentItemsCount2;
                i15 = ((org.telegram.ui.ActionBar.n2) yuVar).currentAccount;
                sentItemsCount = StatsController.getInstance(i15).getSentItemsCount(2, i23) + sentItemsCount3;
                z10 = true;
            }
            tu tuVar = new tu();
            tuVar.d = i19;
            tuVar.c = x12;
            tuVar.b = z10;
            tuVar.e = x13;
            tuVar.g = recivedItemsCount;
            tuVar.f = z12;
            tuVar.h = sentItemsCount;
            tuVarArr2[i19] = tuVar;
            tuVarArr[i19] = tuVar;
            fArr[i19] = x12 / this.h3;
            i19++;
        }
    }

    public final void B1(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        int i10;
        int i11;
        String string;
        boolean z12;
        ArrayList arrayList2;
        String format;
        int i12;
        CharSequence concat;
        ArrayList arrayList3;
        ArrayList arrayList4 = this.Z2;
        arrayList4.clear();
        ArrayList arrayList5 = this.a3;
        arrayList4.addAll(arrayList5);
        arrayList5.clear();
        boolean z13 = false;
        arrayList5.add(new pu(0, false));
        long j3 = 0;
        int i13 = 1;
        String formatString = this.h3 > 0 ? LocaleController.formatString(R.string.YourNetworkUsageSince, LocaleController.getInstance().getFormatterStats().format(y1())) : LocaleController.formatString(R.string.NoNetworkUsageSince, LocaleController.getInstance().getFormatterStats().format(y1()));
        arrayList5.add(new pu(1, formatString));
        ArrayList arrayList6 = new ArrayList();
        int i14 = 0;
        while (true) {
            tu[] tuVarArr = this.e3;
            if (i14 >= tuVarArr.length) {
                break;
            }
            tu tuVar = tuVarArr[i14];
            long j10 = j3;
            long j11 = tuVar.c;
            int i15 = tuVar.d;
            int i16 = (this.k3 || this.d3.contains(Integer.valueOf(i15))) ? i13 : 0;
            if (j11 > j10 || i16 != 0) {
                int i17 = this.c3[i15];
                if (i17 <= 0) {
                    Object[] objArr = new Object[i13];
                    objArr[0] = Integer.valueOf(i13);
                    format = String.format("<%d%%", objArr);
                } else {
                    Integer valueOf = Integer.valueOf(i17);
                    Object[] objArr2 = new Object[i13];
                    objArr2[0] = valueOf;
                    format = String.format("%d%%", objArr2);
                }
                SpannableString spannableString = new SpannableString(format);
                spannableString.setSpan(new org.telegram.ui.Components.m61(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                spannableString.setSpan(new RelativeSizeSpan(0.8f), 0, spannableString.length(), 33);
                ou ouVar = new ou();
                i12 = i13;
                ArrayList arrayList7 = arrayList6;
                ouVar.a = 0.1d;
                spannableString.setSpan(ouVar, 0, spannableString.length(), 33);
                int i18 = yu.f[i15];
                int[] iArr = yu.d[i15];
                int i19 = iArr[0];
                int i20 = iArr[i12];
                if (j11 == j10) {
                    concat = LocaleController.getString(yu.h[i15]);
                } else {
                    CharSequence string2 = LocaleController.getString(yu.h[i15]);
                    CharSequence[] charSequenceArr = new CharSequence[3];
                    charSequenceArr[0] = string2;
                    charSequenceArr[i12] = "  ";
                    charSequenceArr[2] = spannableString;
                    concat = TextUtils.concat(charSequenceArr);
                }
                pu puVar = new pu(i14, i18, i19, i20, concat, AndroidUtilities.formatFileSize(j11));
                arrayList3 = arrayList7;
                arrayList3.add(puVar);
            } else {
                i12 = i13;
                arrayList3 = arrayList6;
            }
            i14++;
            arrayList6 = arrayList3;
            j3 = j10;
            i13 = i12;
        }
        int i21 = i13;
        ArrayList arrayList8 = arrayList6;
        long j12 = j3;
        if (arrayList8.isEmpty()) {
            z11 = false;
            arrayList = arrayList8;
        } else {
            SpannableString spannableString2 = new SpannableString("^");
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_upload).mutate();
            int i22 = org.telegram.ui.ActionBar.i6.G6;
            org.telegram.ui.ActionBar.e6 e6Var = this.n2;
            int w02 = org.telegram.ui.ActionBar.i6.w0(i22, e6Var);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            mutate.setColorFilter(new PorterDuffColorFilter(w02, mode));
            mutate.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
            spannableString2.setSpan(new ImageSpan(mutate, 2), 0, i21, 33);
            SpannableString spannableString3 = new SpannableString("v");
            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_mini_download).mutate();
            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i22, e6Var), mode));
            mutate2.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
            spannableString3.setSpan(new ImageSpan(mutate2, 2), 0, 1, 33);
            int i23 = 0;
            while (i23 < arrayList8.size()) {
                int i24 = ((pu) arrayList8.get(i23)).h;
                if (i24 < 0 || this.g3[i24]) {
                    z12 = z13;
                    arrayList2 = arrayList8;
                } else {
                    tu tuVar2 = this.e3[i24];
                    int[] iArr2 = yu.n;
                    int i25 = tuVar2.d;
                    int i26 = tuVar2.g;
                    int i27 = tuVar2.h;
                    long j13 = tuVar2.e;
                    z12 = z13;
                    ArrayList arrayList9 = arrayList8;
                    long j14 = tuVar2.f;
                    int i28 = iArr2[i25];
                    if (i28 == 0) {
                        if (j14 > j12 || i27 > 0) {
                            i23++;
                            arrayList2 = arrayList9;
                            arrayList2.add(i23, pu.b(LocaleController.formatPluralStringComma("OutgoingCallsCount", i27), AndroidUtilities.formatFileSize(j14)));
                        } else {
                            arrayList2 = arrayList9;
                        }
                        if (j13 > j12 || i26 > 0) {
                            i23++;
                            arrayList2.add(i23, pu.b(LocaleController.formatPluralStringComma("IncomingCallsCount", i26), AndroidUtilities.formatFileSize(j13)));
                        }
                    } else {
                        arrayList2 = arrayList9;
                        if (i28 != 1) {
                            if (j14 > j12 || i27 > 0) {
                                i23++;
                                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("FilesSentCount", i27));
                                CharSequence[] charSequenceArr2 = new CharSequence[3];
                                charSequenceArr2[z12 ? 1 : 0] = spannableString2;
                                charSequenceArr2[1] = " ";
                                charSequenceArr2[2] = replaceTags;
                                arrayList2.add(i23, pu.b(TextUtils.concat(charSequenceArr2), AndroidUtilities.formatFileSize(j14)));
                            }
                            if (j13 > j12 || i26 > 0) {
                                i23++;
                                SpannableStringBuilder replaceTags2 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("FilesReceivedCount", i26));
                                CharSequence[] charSequenceArr3 = new CharSequence[3];
                                charSequenceArr3[z12 ? 1 : 0] = spannableString3;
                                charSequenceArr3[1] = " ";
                                charSequenceArr3[2] = replaceTags2;
                                arrayList2.add(i23, pu.b(TextUtils.concat(charSequenceArr3), AndroidUtilities.formatFileSize(j13)));
                            }
                        } else {
                            if (j14 > j12 || i27 > 0) {
                                i23++;
                                String string3 = LocaleController.getString(R.string.BytesSent);
                                CharSequence[] charSequenceArr4 = new CharSequence[3];
                                charSequenceArr4[z12 ? 1 : 0] = spannableString2;
                                charSequenceArr4[1] = " ";
                                charSequenceArr4[2] = string3;
                                arrayList2.add(i23, pu.b(TextUtils.concat(charSequenceArr4), AndroidUtilities.formatFileSize(j14)));
                            }
                            if (j13 > j12 || i26 > 0) {
                                i23++;
                                String string4 = LocaleController.getString(R.string.BytesReceived);
                                CharSequence[] charSequenceArr5 = new CharSequence[3];
                                charSequenceArr5[z12 ? 1 : 0] = spannableString3;
                                charSequenceArr5[1] = " ";
                                charSequenceArr5[2] = string4;
                                arrayList2.add(i23, pu.b(TextUtils.concat(charSequenceArr5), AndroidUtilities.formatFileSize(j13)));
                                i23++;
                                arrayList8 = arrayList2;
                                z13 = z12;
                            }
                        }
                    }
                }
                i23++;
                arrayList8 = arrayList2;
                z13 = z12;
            }
            z11 = z13;
            arrayList = arrayList8;
            arrayList5.addAll(arrayList);
            if (!this.k3) {
                arrayList5.add(new pu(3, LocaleController.getString(R.string.DataUsageSectionsInfo) + "\n"));
            }
        }
        if (!this.k3) {
            arrayList5.add(new pu(4, LocaleController.getString(R.string.TotalNetworkUsage)));
            arrayList5.add(new pu(-1, R.drawable.msg_filled_data_sent, -11565578, -13276952, LocaleController.getString(R.string.BytesSent), AndroidUtilities.formatFileSize(this.j3)));
            arrayList5.add(new pu(-1, R.drawable.msg_filled_data_received, -11154873, -14175180, LocaleController.getString(R.string.BytesReceived), AndroidUtilities.formatFileSize(this.i3)));
        }
        if (arrayList.isEmpty()) {
            i10 = 3;
        } else {
            i10 = 3;
            arrayList5.add(new pu(3, formatString));
        }
        if (this.W2 != 0) {
            if (arrayList.isEmpty()) {
                arrayList5.add(new pu(i10, z11));
            }
            arrayList5.add(new pu(-2, R.drawable.msg_download_settings, -11565578, -13276952, LocaleController.getString(R.string.AutomaticDownloadSettings), null));
            int i29 = this.W2;
            if (i29 != 1) {
                i11 = 3;
                string = i29 != 3 ? LocaleController.getString(R.string.AutomaticDownloadSettingsInfoWiFi) : LocaleController.getString(R.string.AutomaticDownloadSettingsInfoRoaming);
            } else {
                i11 = 3;
                string = LocaleController.getString(R.string.AutomaticDownloadSettingsInfoMobile);
            }
            arrayList5.add(new pu(i11, string));
        }
        if (!arrayList.isEmpty()) {
            arrayList5.add(new pu(5, LocaleController.getString(R.string.ResetStatistics)));
        }
        arrayList5.add(new pu(3, false));
        su suVar = this.Y2;
        if (suVar != null) {
            if (z10) {
                suVar.E(arrayList4, arrayList5);
            } else {
                suVar.l();
            }
        }
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
    }

    public final long x1(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.W2;
        yu yuVar = this.m3;
        if (i15 == 1 || i15 == 2 || i15 == 3) {
            i11 = ((org.telegram.ui.ActionBar.n2) yuVar).currentAccount;
            return StatsController.getInstance(i11).getReceivedBytesCount(this.W2 - 1, i10);
        }
        i12 = ((org.telegram.ui.ActionBar.n2) yuVar).currentAccount;
        long receivedBytesCount = StatsController.getInstance(i12).getReceivedBytesCount(0, i10);
        i13 = ((org.telegram.ui.ActionBar.n2) yuVar).currentAccount;
        long receivedBytesCount2 = StatsController.getInstance(i13).getReceivedBytesCount(1, i10) + receivedBytesCount;
        i14 = ((org.telegram.ui.ActionBar.n2) yuVar).currentAccount;
        return StatsController.getInstance(i14).getReceivedBytesCount(2, i10) + receivedBytesCount2;
    }

    public final long y1() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.W2;
        yu yuVar = this.m3;
        if (i14 == 1 || i14 == 2 || i14 == 3) {
            i10 = ((org.telegram.ui.ActionBar.n2) yuVar).currentAccount;
            return StatsController.getInstance(i10).getResetStatsDate(this.W2 - 1);
        }
        i11 = ((org.telegram.ui.ActionBar.n2) yuVar).currentAccount;
        long resetStatsDate = StatsController.getInstance(i11).getResetStatsDate(0);
        i12 = ((org.telegram.ui.ActionBar.n2) yuVar).currentAccount;
        long resetStatsDate2 = StatsController.getInstance(i12).getResetStatsDate(1);
        i13 = ((org.telegram.ui.ActionBar.n2) yuVar).currentAccount;
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
        int i15 = this.W2;
        yu yuVar = this.m3;
        if (i15 == 1 || i15 == 2 || i15 == 3) {
            i11 = ((org.telegram.ui.ActionBar.n2) yuVar).currentAccount;
            return StatsController.getInstance(i11).getSentBytesCount(this.W2 - 1, i10);
        }
        i12 = ((org.telegram.ui.ActionBar.n2) yuVar).currentAccount;
        long sentBytesCount = StatsController.getInstance(i12).getSentBytesCount(0, i10);
        i13 = ((org.telegram.ui.ActionBar.n2) yuVar).currentAccount;
        long sentBytesCount2 = StatsController.getInstance(i13).getSentBytesCount(1, i10) + sentBytesCount;
        i14 = ((org.telegram.ui.ActionBar.n2) yuVar).currentAccount;
        return StatsController.getInstance(i14).getSentBytesCount(2, i10) + sentBytesCount2;
    }
}
