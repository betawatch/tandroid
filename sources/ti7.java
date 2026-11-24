// default package

import java.io.FileInputStream;
import java.nio.channels.FileLock;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ti7 extends qx2 {
    public qj7 a;
    public FileInputStream b;
    public FileLock c;
    public boolean d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ui7 f;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti7(ui7 ui7Var, px2 px2Var) {
        super(px2Var);
        this.f = ui7Var;
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.h |= TLObject.FLAG_31;
        return this.f.e(null, this);
    }
}
