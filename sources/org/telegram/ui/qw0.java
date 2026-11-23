package org.telegram.ui;

import java.util.Comparator;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qw0 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ qw0(int i7) {
        this.a = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int i7 = obj instanceof vw0 ? ((vw0) obj).g : obj instanceof org.telegram.messenger.zo ? ((org.telegram.messenger.zo) obj).d : 0;
                int i10 = obj2 instanceof vw0 ? ((vw0) obj2).g : obj2 instanceof org.telegram.messenger.zo ? ((org.telegram.messenger.zo) obj2).d : 0;
                if (i7 < i10) {
                    return -1;
                }
                return i7 > i10 ? 1 : 0;
            case 1:
                long j3 = org.telegram.messenger.k10.i(((Integer) obj).intValue()).Z;
                long j10 = org.telegram.messenger.k10.i(((Integer) obj2).intValue()).Z;
                if (j3 > j10) {
                    return 1;
                }
                return j3 < j10 ? -1 : 0;
            case 2:
                return Integer.compare(((org.telegram.ui.ActionBar.l6) obj).W, ((org.telegram.ui.ActionBar.l6) obj2).W);
            case 3:
                long j11 = org.telegram.messenger.k10.i(((Integer) obj).intValue()).Z;
                long j12 = org.telegram.messenger.k10.i(((Integer) obj2).intValue()).Z;
                if (j11 > j12) {
                    return 1;
                }
                return j11 < j12 ? -1 : 0;
            case 4:
                return Integer.compare(((org.telegram.ui.Wallet.q0) obj2).b, ((org.telegram.ui.Wallet.q0) obj).b);
            case 5:
                return Integer.compare(((TL_wallet.walletTransaction) obj2).date, ((TL_wallet.walletTransaction) obj).date);
            case 6:
                long j13 = org.telegram.messenger.k10.i(((Integer) obj).intValue()).Z;
                long j14 = org.telegram.messenger.k10.i(((Integer) obj2).intValue()).Z;
                if (j13 > j14) {
                    return 1;
                }
                return j13 < j14 ? -1 : 0;
            case 7:
                return (int) (((org.telegram.ui.web.j) obj2).c - ((org.telegram.ui.web.j) obj).c);
            case 8:
                return (int) (((org.telegram.ui.web.j) obj2).c - ((org.telegram.ui.web.j) obj).c);
            case 9:
                return Long.compare(((org.telegram.utils.twidget.k0) obj2).y, ((org.telegram.utils.twidget.k0) obj).y);
            case 10:
                return ((v4.f1) obj2).a.getTop() - ((v4.f1) obj).a.getTop();
            case 11:
                return ((s2.e) obj).a.compareTo(((s2.e) obj2).a);
            case 12:
                return (int) ((((ug.l1) obj).a * 100.0f) - (((ug.l1) obj2).a * 100.0f));
            default:
                return ((String) obj).compareTo((String) obj2);
        }
    }
}
