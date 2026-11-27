// default package

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import javax.net.SocketFactory;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class zna {
    public final SocketFactory a;
    public final ra b;
    public final short c;
    public final int d;
    public final short e;

    /* JADX WARN: Multi-variable type inference failed */
    public zna(SocketFactory socketFactory, ra raVar, int i, int i2, int i3) {
        this.a = socketFactory;
        this.b = raVar;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public final Socket a(InetAddress[] inetAddressArr) {
        u8a u8aVar = new u8a();
        ArrayList arrayList = new ArrayList(inetAddressArr.length);
        int i = 0;
        ed edVar = null;
        int i2 = 0;
        for (InetAddress inetAddress : inetAddressArr) {
            int i3 = this.d;
            if ((i3 != 2 || (inetAddress instanceof Inet4Address)) && (i3 != 3 || (inetAddress instanceof Inet6Address))) {
                int i4 = i2 + this.e;
                ed edVar2 = new ed(i4, (byte) 17);
                arrayList.add(new yna(u8aVar, this.a, new InetSocketAddress(inetAddress, this.b.b), this.c, edVar, edVar2));
                edVar = edVar2;
                i2 = i4;
            }
        }
        u8aVar.b = arrayList;
        u8aVar.a = new CountDownLatch(((ArrayList) u8aVar.b).size());
        ArrayList arrayList2 = (ArrayList) u8aVar.b;
        int size = arrayList2.size();
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            ((yna) obj).start();
        }
        ((CountDownLatch) u8aVar.a).await();
        Socket socket = (Socket) u8aVar.c;
        if (socket != null) {
            return socket;
        }
        Exception exc = (Exception) u8aVar.d;
        if (exc != null) {
            throw exc;
        }
        throw new syc(44, "No viable interface to connect");
    }
}
