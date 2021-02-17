import marked from 'marked'
import hljs  from 'highlight.js'
import 'highlight.js/styles/atom-one-dark.css';

const renderMarkdown = (content) => {
    var renderMD = new marked.Renderer();
    marked.setOptions({
        renderer: renderMD,
        gfm: true,
        tables: true,
        breaks: false,
        pedantic: false,
        sanitize: false,
        smartLists: true,
        smartypants: false,
        highlight: function (code) {
            return hljs.highlightAuto(code).value;
        }
    })
    var ret = marked(content)
    return ret
}

export {
    renderMarkdown
}