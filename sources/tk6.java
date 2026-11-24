// default package

import android.graphics.Typeface;
import java.util.Comparator;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class tk6 implements Comparator {
    public final /* synthetic */ byte a;

    public /* synthetic */ tk6(byte b) {
        this.a = b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compare;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        switch (this.a) {
            case 0:
                ei5 ei5Var = (ei5) obj;
                ei5 ei5Var2 = (ei5) obj2;
                int compare2 = Integer.compare(ei5Var.b, ei5Var2.b);
                return compare2 == 0 ? Integer.compare(ei5Var2.d, ei5Var.d) : compare2;
            case 1:
                String[] strArr = MediaController.W1;
                long j = ((jo6) obj).D;
                long j2 = ((jo6) obj2).D;
                if (j < j2) {
                    return 1;
                }
                return j > j2 ? -1 : 0;
            case 2:
                k47 k47Var = (k47) obj;
                k47 k47Var2 = (k47) obj2;
                String[] strArr2 = MediaController.W1;
                int e1 = k47Var.e1();
                int e12 = k47Var2.e1();
                long j3 = k47Var.k.grouped_id;
                long j4 = k47Var2.k.grouped_id;
                if (e1 >= 0 || e12 >= 0) {
                    if (j3 == 0 || j3 != j4) {
                        return Integer.compare(e1, e12);
                    }
                    compare = Integer.compare(e12, e1);
                } else {
                    if (j3 == 0 || j3 != j4) {
                        return Integer.compare(e12, e1);
                    }
                    compare = Integer.compare(e1, e12);
                }
                return -compare;
            case 3:
                double d = ((TLRPC.TL_topPeer) obj).rating;
                double d2 = ((TLRPC.TL_topPeer) obj2).rating;
                if (d > d2) {
                    return -1;
                }
                return d < d2 ? 1 : 0;
            case 4:
                int i7 = ((TLRPC.MessageEntity) obj).offset;
                int i8 = ((TLRPC.MessageEntity) obj2).offset;
                if (i7 > i8) {
                    return 1;
                }
                return i7 < i8 ? -1 : 0;
            case 5:
                double d3 = ((TLRPC.TL_topPeer) obj).rating;
                double d4 = ((TLRPC.TL_topPeer) obj2).rating;
                if (d3 > d4) {
                    return -1;
                }
                return d3 < d4 ? 1 : 0;
            case 6:
                double d5 = ((TLRPC.TL_topPeer) obj).rating;
                double d6 = ((TLRPC.TL_topPeer) obj2).rating;
                if (d5 > d6) {
                    return -1;
                }
                return d5 < d6 ? 1 : 0;
            case 7:
                int i9 = ((TLRPC.MessageEntity) obj).offset;
                int i10 = ((TLRPC.MessageEntity) obj2).offset;
                if (i9 > i10) {
                    return 1;
                }
                return i9 < i10 ? -1 : 0;
            case 8:
                return Integer.compare(((TLRPC.MessageEntity) obj).offset, ((TLRPC.MessageEntity) obj2).offset);
            case 9:
                return Double.compare(((TLRPC.TL_topPeer) obj2).rating, ((TLRPC.TL_topPeer) obj).rating);
            case 10:
                int i11 = ((TLRPC.MessageEntity) obj).offset;
                int i12 = ((TLRPC.MessageEntity) obj2).offset;
                if (i11 > i12) {
                    return 1;
                }
                return i11 < i12 ? -1 : 0;
            case 11:
                return ((String) obj2).length() - ((String) obj).length();
            case 12:
                return ((c47) obj).a - ((c47) obj2).a;
            case 13:
                return gm.A(((TLRPC.Updates) obj).pts, ((TLRPC.Updates) obj2).pts);
            case 14:
                return ((k47) obj2).e1() - ((k47) obj).e1();
            case 15:
                k47 k47Var3 = (k47) obj;
                k47 k47Var4 = (k47) obj2;
                if (k47Var3.k.date != k47Var4.k.date || k47Var3.e1() < 0 || k47Var4.e1() < 0) {
                    i = k47Var4.k.date;
                    i2 = k47Var3.k.date;
                } else {
                    i = k47Var4.e1();
                    i2 = k47Var3.e1();
                }
                return i - i2;
            case 16:
                return ((k47) obj2).e1() - ((k47) obj).e1();
            case 17:
                TLRPC.Update update = (TLRPC.Update) obj;
                TLRPC.Update update2 = (TLRPC.Update) obj2;
                int U1 = oc7.U1(update);
                int U12 = oc7.U1(update2);
                if (U1 != U12) {
                    return gm.A(U1, U12);
                }
                if (U1 == 0) {
                    return gm.A(oc7.S1(update), oc7.S1(update2));
                }
                if (U1 == 1) {
                    return gm.A(update instanceof TL_update.TL_updateNewEncryptedMessage ? ((TL_update.TL_updateNewEncryptedMessage) update).qts : 0, update2 instanceof TL_update.TL_updateNewEncryptedMessage ? ((TL_update.TL_updateNewEncryptedMessage) update2).qts : 0);
                }
                if (U1 != 2) {
                    return 0;
                }
                long R1 = oc7.R1(update);
                long R12 = oc7.R1(update2);
                if (R1 == R12) {
                    return gm.A(oc7.S1(update), oc7.S1(update2));
                }
                Typeface typeface = gm.a;
                if (R1 != R12) {
                    return R1 > R12 ? 1 : -1;
                }
                return 0;
            case 18:
                TLRPC.TL_savedReactionTag tL_savedReactionTag = (TLRPC.TL_savedReactionTag) obj;
                TLRPC.TL_savedReactionTag tL_savedReactionTag2 = (TLRPC.TL_savedReactionTag) obj2;
                int i13 = tL_savedReactionTag.count;
                int i14 = tL_savedReactionTag2.count;
                return i13 == i14 ? Long.compare(oc7.O1(tL_savedReactionTag2.reaction) ^ Long.MIN_VALUE, oc7.O1(tL_savedReactionTag.reaction) ^ Long.MIN_VALUE) : i14 - i13;
            case 19:
                TLRPC.TL_savedReactionTag tL_savedReactionTag3 = (TLRPC.TL_savedReactionTag) obj;
                TLRPC.TL_savedReactionTag tL_savedReactionTag4 = (TLRPC.TL_savedReactionTag) obj2;
                int i15 = tL_savedReactionTag3.count;
                int i16 = tL_savedReactionTag4.count;
                return i15 == i16 ? Long.compare(oc7.O1(tL_savedReactionTag4.reaction) ^ Long.MIN_VALUE, oc7.O1(tL_savedReactionTag3.reaction) ^ Long.MIN_VALUE) : i16 - i15;
            case 20:
                int i17 = ((ub7) obj).f;
                int i18 = ((ub7) obj2).f;
                if (i17 > i18) {
                    return 1;
                }
                return i17 < i18 ? -1 : 0;
            case 21:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj2;
                return gm.A(updates instanceof TLRPC.TL_updatesCombined ? updates.seq_start : updates.seq, updates2 instanceof TLRPC.TL_updatesCombined ? updates2.seq_start : updates2.seq);
            case 22:
                return gm.A(((TLRPC.Updates) obj).pts, ((TLRPC.Updates) obj2).pts);
            case 23:
                return gm.A(((TLRPC.Updates) obj).pts, ((TLRPC.Updates) obj2).pts);
            case 24:
                int i19 = ((ub7) obj).f;
                int i20 = ((ub7) obj2).f;
                if (i19 > i20) {
                    return 1;
                }
                return i19 < i20 ? -1 : 0;
            case 25:
                TLRPC.Message message = (TLRPC.Message) obj;
                TLRPC.Message message2 = (TLRPC.Message) obj2;
                if (k47.f3(message.id) || k47.f3(message2.id)) {
                    int i21 = message.date;
                    int i22 = message2.date;
                    if (i21 <= i22) {
                        if (i21 >= i22) {
                            if (!k47.f3(message.id) || k47.f3(message2.id)) {
                                if ((k47.f3(message.id) || !k47.f3(message2.id)) && (i3 = message.id) <= (i4 = message2.id)) {
                                    if (i3 >= i4) {
                                        return 0;
                                    }
                                }
                            }
                        }
                        return 1;
                    }
                    return -1;
                }
                int i23 = message.id;
                if (i23 > 0 && (i6 = message2.id) > 0) {
                    if (i23 <= i6) {
                        if (i23 >= i6) {
                            return 0;
                        }
                        return 1;
                    }
                    return -1;
                }
                if (i23 < 0 && (i5 = message2.id) < 0) {
                    if (i23 >= i5) {
                        if (i23 <= i5) {
                            return 0;
                        }
                        return 1;
                    }
                    return -1;
                }
                int i24 = message.date;
                int i25 = message2.date;
                if (i24 <= i25) {
                    if (i24 >= i25) {
                        return 0;
                    }
                    return 1;
                }
                return -1;
            case 26:
                int i26 = ((ub7) obj).f;
                int i27 = ((ub7) obj2).f;
                if (i26 > i27) {
                    return 1;
                }
                return i26 < i27 ? -1 : 0;
            case 27:
                int i28 = ((im3) obj).b;
                int i29 = ((im3) obj2).b;
                if (i28 < i29) {
                    return 1;
                }
                return i28 > i29 ? -1 : 0;
            case 28:
                long j5 = z8c.h(((Integer) obj).intValue()).Z;
                long j6 = z8c.h(((Integer) obj2).intValue()).Z;
                if (j5 > j6) {
                    return 1;
                }
                return j5 < j6 ? -1 : 0;
            default:
                return ((TL_account.TL_businessWeeklyOpen) obj).start_minute - ((TL_account.TL_businessWeeklyOpen) obj2).start_minute;
        }
    }

    public /* synthetic */ tk6(oc7 oc7Var, byte b) {
        this.a = b;
    }
}
