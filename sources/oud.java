// default package

/* loaded from: classes.dex */
public final class oud {
    public static bud a(Object obj, Object obj2) {
        bud budVar = (bud) obj;
        bud budVar2 = (bud) obj2;
        if (!budVar2.isEmpty()) {
            if (!budVar.a) {
                if (budVar.isEmpty()) {
                    budVar = new bud();
                } else {
                    bud budVar3 = new bud(budVar);
                    budVar3.a = true;
                    budVar = budVar3;
                }
            }
            budVar.b();
            if (!budVar2.isEmpty()) {
                budVar.putAll(budVar2);
            }
        }
        return budVar;
    }
}
