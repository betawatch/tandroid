// default package

import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class w05 {
    public final String a;
    public final long b;
    public final byte[] c;
    public final byte[] d;
    public final int e;
    public w05 f;
    public List g;
    public TL_wallet.WalletOnchainGiftAction h;
    public TL_stars.StarGift i;

    public w05(String str, long j, byte[] bArr, byte[] bArr2, int i) {
        this.a = str;
        this.b = j;
        this.c = bArr;
        this.d = bArr2;
        this.e = i;
    }

    public static w05 a(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty() || arrayList.size() > 255) {
            w26.j("Invalid prepared message count");
            return null;
        }
        if (arrayList.size() == 1) {
            return b((TL_stars.TL_payments_starGiftOnchainOfferTxMessage) arrayList.get(0));
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        long j = 0;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            w05 b = b((TL_stars.TL_payments_starGiftOnchainOfferTxMessage) obj);
            arrayList2.add(b);
            j += b.b;
        }
        w05 w05Var = (w05) arrayList2.get(0);
        w05 w05Var2 = new w05(w05Var.a, j, w05Var.c, w05Var.d, w05Var.e);
        w05Var2.g = DesugarCollections.unmodifiableList(arrayList2);
        return w05Var2;
    }

    public static w05 b(TL_stars.TL_payments_starGiftOnchainOfferTxMessage tL_payments_starGiftOnchainOfferTxMessage) {
        byte[] bArr;
        int[] iArr;
        TL_stars.TL_payments_starGiftOnchainOfferTxInitState tL_payments_starGiftOnchainOfferTxInitState = tL_payments_starGiftOnchainOfferTxMessage.init_state;
        dd ddVar = null;
        if (tL_payments_starGiftOnchainOfferTxInitState != null) {
            byte[] bArr2 = tL_payments_starGiftOnchainOfferTxInitState.code;
            byte[] bArr3 = tL_payments_starGiftOnchainOfferTxInitState.data;
            dd b = (bArr2 == null || bArr2.length <= 0) ? null : rve.b(bArr2);
            if (bArr3 != null && bArr3.length > 0) {
                ddVar = rve.b(bArr3);
            }
            ArrayList arrayList = new ArrayList();
            ssb ssbVar = new ssb();
            arrayList.add(ssbVar);
            ArrayList arrayList2 = new ArrayList();
            if (b != null) {
                arrayList2.add(Integer.valueOf(rve.a(arrayList, b)));
            }
            if (ddVar != null) {
                arrayList2.add(Integer.valueOf(rve.a(arrayList, ddVar)));
            }
            ssbVar.c = new byte[]{(byte) ((((b != null ? 4 : 0) | (ddVar != null ? 2 : 0)) << 3) | 4)};
            ssbVar.d = new int[arrayList2.size()];
            int i = 0;
            while (true) {
                iArr = ssbVar.d;
                if (i >= iArr.length) {
                    break;
                }
                iArr[i] = ((Integer) arrayList2.get(i)).intValue();
                i++;
            }
            ssbVar.a = iArr.length;
            ssbVar.b = 1;
            int size = arrayList.size();
            int i2 = 1;
            while (i2 < 4 && (size >>> (i2 << 3)) != 0) {
                i2++;
            }
            int size2 = arrayList.size();
            int i3 = 0;
            int i4 = 0;
            while (i4 < size2) {
                Object obj = arrayList.get(i4);
                i4++;
                ssb ssbVar2 = (ssb) obj;
                i3 += (ssbVar2.d.length * i2) + ssbVar2.c.length + 2;
            }
            int i5 = 1;
            while (i5 < 4 && (i3 >>> (i5 << 3)) != 0) {
                i5++;
            }
            int max = Math.max(1, i5);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            rve.d(byteArrayOutputStream, -1242653582, 4);
            byteArrayOutputStream.write(i2 | 64);
            byteArrayOutputStream.write(max);
            rve.d(byteArrayOutputStream, arrayList.size(), i2);
            rve.d(byteArrayOutputStream, 1, i2);
            rve.d(byteArrayOutputStream, 0, i2);
            rve.d(byteArrayOutputStream, i3, max);
            rve.d(byteArrayOutputStream, 0, i2);
            int size3 = arrayList.size();
            int i6 = 0;
            while (i6 < size3) {
                Object obj2 = arrayList.get(i6);
                i6++;
                ssb ssbVar3 = (ssb) obj2;
                byteArrayOutputStream.write(ssbVar3.a);
                byteArrayOutputStream.write(ssbVar3.b);
                byte[] bArr4 = ssbVar3.c;
                byteArrayOutputStream.write(bArr4, 0, bArr4.length);
                for (int i7 : ssbVar3.d) {
                    rve.d(byteArrayOutputStream, i7, i2);
                }
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (rve.a == null) {
                int[] iArr2 = new int[256];
                for (int i8 = 0; i8 < 256; i8++) {
                    int i9 = i8;
                    for (int i10 = 0; i10 < 8; i10++) {
                        int i11 = i9 & 1;
                        i9 >>>= 1;
                        if (i11 != 0) {
                            i9 ^= -2097792136;
                        }
                    }
                    iArr2[i8] = i9;
                }
                rve.a = iArr2;
            }
            int i12 = -1;
            for (byte b2 : byteArray) {
                i12 = (i12 >>> 8) ^ rve.a[(b2 ^ i12) & kk7.d4];
            }
            int i13 = ~i12;
            byte[] bArr5 = new byte[byteArray.length + 4];
            System.arraycopy(byteArray, 0, bArr5, 0, byteArray.length);
            bArr5[byteArray.length] = (byte) i13;
            bArr5[byteArray.length + 1] = (byte) (i13 >>> 8);
            bArr5[byteArray.length + 2] = (byte) (i13 >>> 16);
            bArr5[byteArray.length + 3] = (byte) (i13 >>> 24);
            bArr = bArr5;
        } else {
            bArr = null;
        }
        return new w05(tL_payments_starGiftOnchainOfferTxMessage.destination, tL_payments_starGiftOnchainOfferTxMessage.value, tL_payments_starGiftOnchainOfferTxMessage.body, bArr, tL_payments_starGiftOnchainOfferTxMessage.mode);
    }
}
