// default package

import android.graphics.Typeface;
import android.view.View;
import java.util.Comparator;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class vk6 implements Comparator {
    public final /* synthetic */ byte a;

    public /* synthetic */ vk6(byte b) {
        this.a = b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        if (r7 < r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0055, code lost:
    
        if (r7 > r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005e, code lost:
    
        if (r7 < r8) goto L42;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
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
                hi5 hi5Var = (hi5) obj;
                hi5 hi5Var2 = (hi5) obj2;
                int compare2 = Integer.compare(hi5Var.b, hi5Var2.b);
                return compare2 == 0 ? Integer.compare(hi5Var2.d, hi5Var.d) : compare2;
            case 1:
                r47 r47Var = (r47) obj;
                r47 r47Var2 = (r47) obj2;
                String[] strArr = MediaController.W1;
                int e1 = r47Var.e1();
                int e12 = r47Var2.e1();
                long j = r47Var.k.grouped_id;
                long j2 = r47Var2.k.grouped_id;
                if (e1 >= 0 || e12 >= 0) {
                    if (j == 0 || j != j2) {
                        return Integer.compare(e1, e12);
                    }
                    compare = Integer.compare(e12, e1);
                } else {
                    if (j == 0 || j != j2) {
                        return Integer.compare(e12, e1);
                    }
                    compare = Integer.compare(e1, e12);
                }
                return -compare;
            case 2:
                String[] strArr2 = MediaController.W1;
                long j3 = ((no6) obj).D;
                long j4 = ((no6) obj2).D;
                if (j3 < j4) {
                    return 1;
                }
                return j3 <= j4 ? 0 : -1;
            case 3:
                double d = ((TLRPC.TL_topPeer) obj).rating;
                double d2 = ((TLRPC.TL_topPeer) obj2).rating;
                if (d <= d2) {
                    return d < d2 ? 1 : 0;
                }
                return -1;
            case 4:
                double d3 = ((TLRPC.TL_topPeer) obj).rating;
                double d4 = ((TLRPC.TL_topPeer) obj2).rating;
                if (d3 <= d4) {
                    return d3 < d4 ? 1 : 0;
                }
                return -1;
            case 5:
                double d5 = ((TLRPC.TL_topPeer) obj).rating;
                double d6 = ((TLRPC.TL_topPeer) obj2).rating;
                if (d5 <= d6) {
                    return d5 < d6 ? 1 : 0;
                }
                return -1;
            case 6:
                int i7 = ((TLRPC.MessageEntity) obj).offset;
                int i8 = ((TLRPC.MessageEntity) obj2).offset;
                if (i7 > i8) {
                    return 1;
                }
                return i7 >= i8 ? 0 : -1;
            case 7:
                return Integer.compare(((TLRPC.MessageEntity) obj).offset, ((TLRPC.MessageEntity) obj2).offset);
            case 8:
                int i9 = ((TLRPC.MessageEntity) obj).offset;
                int i10 = ((TLRPC.MessageEntity) obj2).offset;
                if (i9 > i10) {
                    return 1;
                }
                return i9 >= i10 ? 0 : -1;
            case 9:
                return Double.compare(((TLRPC.TL_topPeer) obj2).rating, ((TLRPC.TL_topPeer) obj).rating);
            case 10:
                int i11 = ((TLRPC.MessageEntity) obj).offset;
                int i12 = ((TLRPC.MessageEntity) obj2).offset;
                if (i11 > i12) {
                    return 1;
                }
                return i11 >= i12 ? 0 : -1;
            case 11:
                return ((String) obj2).length() - ((String) obj).length();
            case 12:
                return ((j47) obj).a - ((j47) obj2).a;
            case 13:
                return hl.A(((TLRPC.Updates) obj).pts, ((TLRPC.Updates) obj2).pts);
            case 14:
                return ((r47) obj2).e1() - ((r47) obj).e1();
            case 15:
                r47 r47Var3 = (r47) obj;
                r47 r47Var4 = (r47) obj2;
                if (r47Var3.k.date != r47Var4.k.date || r47Var3.e1() < 0 || r47Var4.e1() < 0) {
                    i = r47Var4.k.date;
                    i2 = r47Var3.k.date;
                } else {
                    i = r47Var4.e1();
                    i2 = r47Var3.e1();
                }
                return i - i2;
            case 16:
                return ((r47) obj2).e1() - ((r47) obj).e1();
            case 17:
                TLRPC.Update update = (TLRPC.Update) obj;
                TLRPC.Update update2 = (TLRPC.Update) obj2;
                int V1 = uc7.V1(update);
                int V12 = uc7.V1(update2);
                if (V1 != V12) {
                    return hl.A(V1, V12);
                }
                if (V1 == 0) {
                    return hl.A(uc7.T1(update), uc7.T1(update2));
                }
                if (V1 == 1) {
                    return hl.A(update instanceof TL_update.TL_updateNewEncryptedMessage ? ((TL_update.TL_updateNewEncryptedMessage) update).qts : 0, update2 instanceof TL_update.TL_updateNewEncryptedMessage ? ((TL_update.TL_updateNewEncryptedMessage) update2).qts : 0);
                }
                if (V1 == 2) {
                    long S1 = uc7.S1(update);
                    long S12 = uc7.S1(update2);
                    if (S1 == S12) {
                        return hl.A(uc7.T1(update), uc7.T1(update2));
                    }
                    Typeface typeface = hl.a;
                    if (S1 != S12) {
                        return S1 > S12 ? 1 : -1;
                    }
                }
                return 0;
            case 18:
                TLRPC.TL_savedReactionTag tL_savedReactionTag = (TLRPC.TL_savedReactionTag) obj;
                TLRPC.TL_savedReactionTag tL_savedReactionTag2 = (TLRPC.TL_savedReactionTag) obj2;
                int i13 = tL_savedReactionTag.count;
                int i14 = tL_savedReactionTag2.count;
                return i13 == i14 ? Long.compare(uc7.P1(tL_savedReactionTag2.reaction) ^ Long.MIN_VALUE, uc7.P1(tL_savedReactionTag.reaction) ^ Long.MIN_VALUE) : i14 - i13;
            case 19:
                TLRPC.TL_savedReactionTag tL_savedReactionTag3 = (TLRPC.TL_savedReactionTag) obj;
                TLRPC.TL_savedReactionTag tL_savedReactionTag4 = (TLRPC.TL_savedReactionTag) obj2;
                int i15 = tL_savedReactionTag3.count;
                int i16 = tL_savedReactionTag4.count;
                return i15 == i16 ? Long.compare(uc7.P1(tL_savedReactionTag4.reaction) ^ Long.MIN_VALUE, uc7.P1(tL_savedReactionTag3.reaction) ^ Long.MIN_VALUE) : i16 - i15;
            case 20:
                int i17 = ((ac7) obj).f;
                int i18 = ((ac7) obj2).f;
                if (i17 > i18) {
                    return 1;
                }
                return i17 >= i18 ? 0 : -1;
            case 21:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj2;
                return hl.A(updates instanceof TLRPC.TL_updatesCombined ? updates.seq_start : updates.seq, updates2 instanceof TLRPC.TL_updatesCombined ? updates2.seq_start : updates2.seq);
            case 22:
                return hl.A(((TLRPC.Updates) obj).pts, ((TLRPC.Updates) obj2).pts);
            case 23:
                return hl.A(((TLRPC.Updates) obj).pts, ((TLRPC.Updates) obj2).pts);
            case 24:
                int i19 = ((ac7) obj).f;
                int i20 = ((ac7) obj2).f;
                if (i19 > i20) {
                    return 1;
                }
                return i19 >= i20 ? 0 : -1;
            case 25:
                int i21 = ((ac7) obj).f;
                int i22 = ((ac7) obj2).f;
                if (i21 > i22) {
                    return 1;
                }
                return i21 >= i22 ? 0 : -1;
            case 26:
                int i23 = ((pl3) obj).b;
                int i24 = ((pl3) obj2).b;
                if (i23 < i24) {
                    return 1;
                }
                return i23 <= i24 ? 0 : -1;
            case 27:
                TLRPC.Message message = (TLRPC.Message) obj;
                TLRPC.Message message2 = (TLRPC.Message) obj2;
                if (r47.f3(message.id) || r47.f3(message2.id)) {
                    int i25 = message.date;
                    int i26 = message2.date;
                    if (i25 > i26) {
                        return -1;
                    }
                    if (i25 >= i26) {
                        if (r47.f3(message.id) && !r47.f3(message2.id)) {
                            return -1;
                        }
                        if ((r47.f3(message.id) || !r47.f3(message2.id)) && (i3 = message.id) <= (i4 = message2.id)) {
                            if (i3 < i4) {
                                return -1;
                            }
                            return 0;
                        }
                    }
                    return 1;
                }
                int i27 = message.id;
                if (i27 <= 0 || (i6 = message2.id) <= 0) {
                    if (i27 >= 0 || (i5 = message2.id) >= 0) {
                        int i28 = message.date;
                        int i29 = message2.date;
                        if (i28 > i29) {
                            return -1;
                        }
                    } else if (i27 < i5) {
                        return -1;
                    }
                } else if (i27 > i6) {
                    return -1;
                }
                break;
            case 28:
                return Integer.compare(((r47) obj).e1(), ((r47) obj2).e1());
            default:
                return Integer.compare(((View) obj).getTop(), ((View) obj2).getTop());
        }
    }

    public /* synthetic */ vk6(uc7 uc7Var, byte b) {
        this.a = b;
    }
}
