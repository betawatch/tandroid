// default package

import java.io.FileInputStream;
import java.nio.channels.FileLock;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class qg7 extends gw2 {
    public nh7 a;
    public FileInputStream b;
    public FileLock c;
    public boolean d;
    public /* synthetic */ Object e;
    public final /* synthetic */ rg7 f;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qg7(rg7 rg7Var, fw2 fw2Var) {
        super(fw2Var);
        this.f = rg7Var;
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.h |= TLObject.FLAG_31;
        return this.f.e(null, this);
    }
}
