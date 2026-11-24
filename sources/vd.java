// default package

import android.view.View;
import j$.util.function.Predicate$-CC;
import java.util.Map;
import java.util.function.Predicate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class vd implements Predicate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;

    public /* synthetic */ vd(byte b, long j) {
        this.a = b;
        this.b = j;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        byte b = this.a;
        return Predicate$-CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        byte b = this.a;
        return Predicate$-CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        byte b = this.a;
        return Predicate$-CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        byte b = this.a;
        long j = this.b;
        switch (b) {
            case 0:
                TLObject tLObject = (TLObject) obj;
                if (!(tLObject instanceof TLRPC.User)) {
                    if (tLObject instanceof TLRPC.Chat) {
                        break;
                    }
                } else if (((TLRPC.User) tLObject).id != j) {
                }
                break;
            case 1:
                if (((TLRPC.User) obj).id != j) {
                    break;
                }
                break;
            case 2:
                if (((TLRPC.User) obj).id != j) {
                    break;
                }
                break;
            default:
                Map.Entry entry = (Map.Entry) obj;
                if (((View) entry.getKey()).isAttachedToWindow() && ((View) entry.getKey()).isShown() && ((View) entry.getKey()).getWindowVisibility() == 0 && j - ((Long) entry.getValue()).longValue() <= 300) {
                    break;
                }
                break;
        }
        return false;
    }
}
