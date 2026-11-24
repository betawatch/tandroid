// default package

import android.util.JsonReader;
import android.util.Log;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.function.Function$-CC;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.function.Function;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class xz implements Function {
    public final /* synthetic */ byte a;

    public /* synthetic */ xz(byte b) {
        this.a = b;
    }

    public final /* synthetic */ Function andThen(Function function) {
        byte b = this.a;
        return Function$-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        String lambda$poll$9;
        long j;
        int[] array;
        switch (this.a) {
            case 0:
                return Integer.valueOf(Integer.bitCount(((Integer) obj).intValue()));
            case 1:
                return Long.valueOf(cf3.n((TLRPC.Peer) obj));
            case 2:
                return Long.valueOf(((k27) obj).Z0());
            case 3:
                lambda$poll$9 = ConferenceCall.lambda$poll$9((ConferenceCall.CallParticipant) obj);
                return lambda$poll$9;
            case 4:
                String name = ((File) obj).getName();
                name.getClass();
                if (name.equals("trigger-type-anomaly")) {
                    return 8;
                }
                return !name.equals("trigger-type-oom") ? 0 : 7;
            case 5:
                File file = (File) obj;
                try {
                    lz2 lz2Var = nz2.g;
                    String f = nz2.f(file);
                    lz2Var.getClass();
                    try {
                        JsonReader jsonReader = new JsonReader(new StringReader(f));
                        try {
                            i80 h = lz2.h(jsonReader);
                            jsonReader.close();
                            return Optional.of(h);
                        } catch (Throwable th) {
                            try {
                                jsonReader.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (IllegalStateException e) {
                        throw new IOException(e);
                    }
                } catch (IOException e2) {
                    Log.w("FirebaseCrashlytics", "Unable to read the Profiling Manager file ", e2);
                    return Optional.empty();
                }
            case 6:
                return Integer.valueOf(((k27) obj).e1());
            case 7:
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) obj;
                if (channelParticipant == null) {
                    return null;
                }
                return channelParticipant.banned_rights;
            case 8:
                return Long.valueOf(cf3.n(((TLRPC.GroupCallParticipant) obj).peer));
            case 9:
                return Long.valueOf(cf3.n(((TLRPC.GroupCallParticipant) obj).peer));
            case 10:
                return ((mx2) obj).a;
            case 11:
                String str = (String) obj;
                Pattern pattern = Utilities.a;
                try {
                    j = Long.parseLong(str);
                } catch (Exception unused) {
                    j = 0;
                }
                return Long.valueOf(j);
            case 12:
                array = DesugarArrays.stream(((String) obj).split(",")).mapToInt(new mm((byte) 8)).toArray();
                return array;
            case 13:
                return String.valueOf((Long) obj);
            case 14:
                return na7.P2((int[]) obj);
            case 15:
                return ((mx2) obj).a;
            default:
                return ((u0c) obj).b;
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        byte b = this.a;
        return Function$-CC.$default$compose(this, function);
    }
}
