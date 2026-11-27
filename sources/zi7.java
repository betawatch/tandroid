// default package

import java.io.FileInputStream;
import java.nio.channels.FileLock;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class zi7 extends ax2 {
    public wj7 a;
    public FileInputStream b;
    public FileLock c;
    public boolean d;
    public /* synthetic */ Object e;
    public final /* synthetic */ aj7 f;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi7(aj7 aj7Var, zw2 zw2Var) {
        super(zw2Var);
        this.f = aj7Var;
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.h |= TLObject.FLAG_31;
        return this.f.e(null, this);
    }
}
