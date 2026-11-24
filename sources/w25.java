// default package

import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class w25 {
    public final String a;
    public final long b;
    public final byte[] c;
    public final byte[] d;
    public final int e;
    public w25 f;
    public List g;
    public TL_wallet.WalletOnchainGiftAction h;
    public TL_stars.StarGift i;

    public w25(String str, long j, byte[] bArr, byte[] bArr2, int i) {
        this.a = str;
        this.b = j;
        this.c = bArr;
        this.d = bArr2;
        this.e = i;
    }

    public static w25 a(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty() || arrayList.size() > 255) {
            u36.j("Invalid prepared message count");
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
            w25 b = b((TL_stars.TL_payments_starGiftOnchainOfferTxMessage) obj);
            arrayList2.add(b);
            j += b.b;
        }
        w25 w25Var = (w25) arrayList2.get(0);
        w25 w25Var2 = new w25(w25Var.a, j, w25Var.c, w25Var.d, w25Var.e);
        w25Var2.g = DesugarCollections.unmodifiableList(arrayList2);
        return w25Var2;
    }

    public static w25 b(TL_stars.TL_payments_starGiftOnchainOfferTxMessage tL_payments_starGiftOnchainOfferTxMessage) {
        byte[] bArr;
        int[] iArr;
        TL_stars.TL_payments_starGiftOnchainOfferTxInitState tL_payments_starGiftOnchainOfferTxInitState = tL_payments_starGiftOnchainOfferTxMessage.init_state;
        de deVar = null;
        if (tL_payments_starGiftOnchainOfferTxInitState != null) {
            byte[] bArr2 = tL_payments_starGiftOnchainOfferTxInitState.code;
            byte[] bArr3 = tL_payments_starGiftOnchainOfferTxInitState.data;
            de b = (bArr2 == null || bArr2.length <= 0) ? null : txe.b(bArr2);
            if (bArr3 != null && bArr3.length > 0) {
                deVar = txe.b(bArr3);
            }
            ArrayList arrayList = new ArrayList();
            tub tubVar = new tub();
            arrayList.add(tubVar);
            ArrayList arrayList2 = new ArrayList();
            if (b != null) {
                arrayList2.add(Integer.valueOf(txe.a(arrayList, b)));
            }
            if (deVar != null) {
                arrayList2.add(Integer.valueOf(txe.a(arrayList, deVar)));
            }
            tubVar.c = new byte[]{(byte) ((((b != null ? 4 : 0) | (deVar != null ? 2 : 0)) << 3) | 4)};
            tubVar.d = new int[arrayList2.size()];
            int i = 0;
            while (true) {
                iArr = tubVar.d;
                if (i >= iArr.length) {
                    break;
                }
                iArr[i] = ((Integer) arrayList2.get(i)).intValue();
                i++;
            }
            tubVar.a = iArr.length;
            tubVar.b = 1;
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
                tub tubVar2 = (tub) obj;
                i3 += (tubVar2.d.length * i2) + tubVar2.c.length + 2;
            }
            int i5 = 1;
            while (i5 < 4 && (i3 >>> (i5 << 3)) != 0) {
                i5++;
            }
            int max = Math.max(1, i5);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            txe.d(byteArrayOutputStream, -1242653582, 4);
            byteArrayOutputStream.write(i2 | 64);
            byteArrayOutputStream.write(max);
            txe.d(byteArrayOutputStream, arrayList.size(), i2);
            txe.d(byteArrayOutputStream, 1, i2);
            txe.d(byteArrayOutputStream, 0, i2);
            txe.d(byteArrayOutputStream, i3, max);
            txe.d(byteArrayOutputStream, 0, i2);
            int size3 = arrayList.size();
            int i6 = 0;
            while (i6 < size3) {
                Object obj2 = arrayList.get(i6);
                i6++;
                tub tubVar3 = (tub) obj2;
                byteArrayOutputStream.write(tubVar3.a);
                byteArrayOutputStream.write(tubVar3.b);
                byte[] bArr4 = tubVar3.c;
                byteArrayOutputStream.write(bArr4, 0, bArr4.length);
                for (int i7 : tubVar3.d) {
                    txe.d(byteArrayOutputStream, i7, i2);
                }
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (txe.a == null) {
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
                txe.a = iArr2;
            }
            int i12 = -1;
            for (byte b2 : byteArray) {
                i12 = (i12 >>> 8) ^ txe.a[(b2 ^ i12) & nm7.d4];
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
        return new w25(tL_payments_starGiftOnchainOfferTxMessage.destination, tL_payments_starGiftOnchainOfferTxMessage.value, tL_payments_starGiftOnchainOfferTxMessage.body, bArr, tL_payments_starGiftOnchainOfferTxMessage.mode);
    }
}
