package com.askzhao.plugin;

/**
 * Created by zhaochuang on 2018/5/24.
 */

class AskDataPointExtension {
    List<String> includeJarFilter = new ArrayList<String>()
    List<String> excludeJarFilter = new ArrayList<String>()
    List<String> ajcArgs = new ArrayList<>();

    public AskDataPointExtension includeJarFilter(String... filters) {
        if (filters != null) {
            includeJarFilter.addAll(filters)
        }

        return this
    }

    public AskDataPointExtension excludeJarFilter(String... filters) {
        if (filters != null) {
            excludeJarFilter.addAll(filters)
        }

        return this
    }

    public AskDataPointExtension ajcArgs(String... ajcArgs) {
        if (ajcArgs != null) {
            this.ajcArgs.addAll(ajcArgs)
        }
        return this
    }
}
